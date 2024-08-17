package jp.co.yahoo.nakayama.basic;

public class Basic08Method04 {

	// 関数
	// public         関数の可視範囲
	// static         全局共有領域に定義
	// void	          関数の戻り値　（戻り値がない場合、void）
	// main           関数の名前
	// String[] args  関数のパラメーター

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		// 実引数 じつひきすう
		int retAB = funAdd("AB", a, b);

		int retABC = funAdd("ABC", a, b, c);

		System.out.println(retAB);
		System.out.println(retABC);
	}

	//	 パラメーターの件数は特定ではない場合 　「...」の書き方を利用ください。
	private static int funAdd(String info, int... arr) {

		int sum = 0;
		for (int num : arr) {
			sum = sum + num;
		}
		return sum;
	}
	

	// ...は最後のパラメーターにしないといけない

	//	int retAB = funAdd(a,b,"AB");
	//
	//	int retABC = funAdd(a,b,c,"ABC");

	//	private static int funAdd(int... arr, String info) {
	//
	//		int sum = 0;
	//		for (int num : arr) {
	//			sum = sum + num;
	//		}
	//		return sum;
	//	}

}
