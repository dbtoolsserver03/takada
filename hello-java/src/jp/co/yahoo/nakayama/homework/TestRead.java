package jp.co.yahoo.nakayama.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 読込＆書込 IO練習.
 */
public class TestRead {

    /**
     * 日本語のエンコード.
     */
  private static final String ENCODE_SJ = "shift-jis";
    private static final String ENCODE_UTF8 = "utf-8";

    public static void main(String[] args) {

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            String folder = "file" + File.separator + "0921" + File.separator;

            String fileNmRead = "output_jp.txt";
            String fileNmWrite = "output_utf8.txt";
            // File.separator File.separatorを使用してOSに依存しないパスを扱うことが推奨されます。
            // これにより、プログラムがどのOSで実行されても正しい区切り記号が使用されます。
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(folder + fileNmRead), ENCODE_SJ));

            // FileOutputStreamでバイトストリームを作成し、OutputStreamWriterでエンコーディングを指定
            writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(folder + fileNmWrite), ENCODE_UTF8));

            while (reader.ready()) {
                writer.write(reader.readLine());
                writer.flush();
                writer.newLine();
            }

            System.out.println("ファイル書き込み成功しました。");
        } catch (FileNotFoundException ef) {
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
            if (reader != null) {
                // ファイルを閉じる ★★★重要
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                // ファイルを閉じる ★★★重要
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
