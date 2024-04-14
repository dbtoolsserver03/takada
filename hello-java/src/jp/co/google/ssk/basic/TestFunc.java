package jp.co.google.ssk.basic;

public class TestFunc {

	public static void main(String[] args) {

		// 每个变量定义占一行
		//long aa =2,bb=3;

		int a = 2;
		int b = 3;

		int sum = add(a, b);

		System.out.println(sum);
		System.out.println(a);

	}

	private static int add(int aa, int bb) {
		int ret = aa + bb;
		aa = 100;
		return ret;
	}
}
