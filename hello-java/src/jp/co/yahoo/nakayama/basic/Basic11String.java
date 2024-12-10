package jp.co.yahoo.nakayama.basic;

// String,Systemは java.langパッケージ下のクラスのため、
// 明示importが不要
public class Basic11String {

	public static void main(String[] args) {

		
		// String：クラス
		// str   ：オブジェクト
		String str = "Hello World  ";
		
		// Instance Methods
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.contains("or"));
		System.out.println(str.contains("ro"));
		System.out.println(str.length());
		System.out.println(str.indexOf(" "));
		System.out.println(str.substring(0,str.indexOf(" ")));
		
		// 1から100   0001の固定形で出力したい場合.
		for (int i = 1; i <= 100; i++) {
			// パラメーターはintの場合 %d
			// 0はゼロで埋める
			// 4は桁数
			
			// Static Methods
			System.out.println(String.format("%04d", i));
		}
		
		
	}

}
