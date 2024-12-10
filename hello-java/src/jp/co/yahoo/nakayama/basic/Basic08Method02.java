package jp.co.yahoo.nakayama.basic;

public class Basic08Method02 {

// 関数
// public         関数の可視範囲
// static         全局共有領域に定義
// void	          関数の戻り値　（戻り値がない場合、void）
// main           関数の名前
// String[] args  関数のパラメーター
	
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		// debug 方法 step in
		// debug 方法 step over
		
		int ret = funAdd(a,b);
		
		System.out.println("para a:" + a);
		System.out.println("para b:" + b);
		
		// debug 方法 ctrl + r
		System.out.println("ret:" + ret);
	}
	
	// 8種類類型の場合、メモリ場所が違います
	private static int funAdd(int a, int b) {
		
		// debug 方法 step return
		int sum = a + b;
		a=10;
		return sum;
	}
	
}
