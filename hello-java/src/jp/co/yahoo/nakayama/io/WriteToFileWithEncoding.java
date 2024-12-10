package jp.co.yahoo.nakayama.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class WriteToFileWithEncoding {
    public static void main(String[] args) {
    	
    	 BufferedWriter writer =null;
        try {
        	
        	// File.separator File.separatorを使用してOSに依存しないパスを扱うことが推奨されます。
        	// これにより、プログラムがどのOSで実行されても正しい区切り記号が使用されます。
        	
        	File f = new File("."+File.separator+ "file"+File.separator+"0914"+File.separator);
        	
        	f.mkdirs();
        	
        	
            // FileOutputStreamでバイトストリームを作成し、OutputStreamWriterでエンコーディングを指定
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("."+File.separator+"file"+File.separator+"0914"+File.separator+"example.txt"), StandardCharsets.UTF_8));
            
            // "shift-jis" 日本語専用エンコード
            
            writer.write("こんにちは、Java！");
            writer.newLine();
            
            // bufferの内容をファイルに一気に書き込みする
            writer.flush();
            writer.write("これはUTF-8で書かれたファイルです。");
            

            
            System.out.println("ファイルに成功しました。");
        } catch(FileNotFoundException ef) {
        	// 役割: ファイル操作時に、指定されたファイルが見つからない場合にスローされる例外です。
        	// 具体的なエラー
            System.out.println("FileNotFoundExceptionエラーが発生しました。");
            ef.printStackTrace();
        } catch (IOException e) {
        	
        	// 役割: 入出力（I/O）操作中に発生する一般的な例外です。ファイル操作に限らず、ネットワーク通信やその他の入出力処理でもスローされます。
        	// FileNotFoundExceptionより、範囲広い
            System.out.println("IOExceptionエラーが発生しました。");
            e.printStackTrace();
        } catch (Exception e) {
        	// 役割: すべてのチェックされる例外のスーパークラスです。
            System.out.println("IOExceptionエラーが発生しました。");
            e.printStackTrace();
        } finally {
        	if (writer!=null) {
                // ファイルを閉じる　★★★重要
                try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
}

