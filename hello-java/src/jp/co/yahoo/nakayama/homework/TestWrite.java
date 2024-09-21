
package jp.co.yahoo.nakayama.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 複数行目のコメントアウト
/*
宿題
XXXXXX
*/

/**
 * 宿題書き込み
 */
public class TestWrite {

	// ルール：定数名は大文字

	/**
	 * 日本語のエンコード
	 */
	private static final String ENCODE_SJ = "shift-jis";

	// 定数
	//	private static final int finalA = 1;
	//	private static int b = 1;

	// ルール：変数名は小文字
	//	private  int c = 1;

	public static void main(String[] args) {

		// 定数のため、内容の修正はできない
		//finalA = 2;

		// 定数ではないため、内容の修正はできる
		//b=2;

		// staticメソッドには、staticフィールドだけ利用できる
		//c=3;

		String[] strArr = { "東京、名古屋", "大阪、北海道" };

		String folder =  "file" + File.separator + "0921" + File.separator;

		String fileNm = "output_jp.txt";

		BufferedWriter writer = null;
		try {

			// File.separator File.separatorを使用してOSに依存しないパスを扱うことが推奨されます。
			// これにより、プログラムがどのOSで実行されても正しい区切り記号が使用されます。

			File f = new File(folder);

			// DISKにフォルダーを新規する 
			f.mkdirs();

			// FileOutputStreamでバイトストリームを作成し、OutputStreamWriterでエンコーディングを指定
			writer = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(folder + fileNm), ENCODE_SJ));

		    for(String str : strArr) {
				writer.write(str);
				writer.newLine();
		    }

			System.out.println("ファイルに成功しました。");
			System.out.println(f.getAbsolutePath());
			
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
			if (writer != null) {
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
