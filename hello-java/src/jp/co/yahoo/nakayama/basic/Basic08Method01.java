package jp.co.yahoo.nakayama.basic;

public class Basic08Method01 {

// 関数
// public         関数の可視範囲
// static         全局共有領域に定義
// void	          関数の戻り値　（戻り値がない場合、void）
// main           関数の名前
// String[] args  関数のパラメーター
	
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		int ret = funAdd01(a,b);
		
		System.out.println(ret);
	}
	
	private static int funAdd01(int a, int b) {
		int sum = a + b;
		
		// 全局共有領域の関数を呼出
		print(sum);
		return sum;
	}
	
	private int funAdd02(int a, int b) {
		int sum = a + b;
		
		// 全局共有領域の関数を呼出
		print(sum);
		return sum;
	}
	
	private static void print(int num) {
		System.out.println(num);
	}

}
