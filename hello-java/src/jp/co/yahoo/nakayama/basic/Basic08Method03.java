package jp.co.yahoo.nakayama.basic;

public class Basic08Method03 {

// 関数
// public         関数の可視範囲
// static         全局共有領域に定義
// void	          関数の戻り値　（戻り値がない場合、void）
// main           関数の名前
// String[] args  関数のパラメーター
	
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		// 実引数 じつひきすう
		int ret = funAdd(a,b);

		long aa = 1;
		long bb = 2;
		long retL = funAdd(aa,bb);
		
	}
	
	// メソッドのオーバーロードは、
	// 同じメソッド名で複数の異なるメソッド
	// を定義することを指します。
	// これにより、引数の数や型に応じて、
	// 異なる処理を行うことができます。
	private static long funAdd(long aa, long bb) {
		long sum = aa + bb;
		aa=10;
		return sum;
	}

	private static int funAdd(int a, int b) {
		
		// 仮引数
		int sum = a + b;
		a=10;
		return sum;
	}
	
}
