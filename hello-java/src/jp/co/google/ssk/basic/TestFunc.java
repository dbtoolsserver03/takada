package jp.co.google.ssk.basic;

public class TestFunc {

	public static void main(String[] args) {

		// 每个变量定义占一行
		//long aa =2,bb=3;

		int a = 2;
		int b = 3;

		int sum = add(a, b);

		long aa = 22;
		long bb = 33;
		
		long sumsum = add(aa,bb);
		
		System.out.println(sum);
		System.out.println(a);
		System.out.println(sumsum);

	}

	// 方法重载（方法名相同，但是参数类型，参数个数，参数顺序不一样）
	private static long add(long aa, long bb) {
		
		return aa+bb;
	}

	private static int add(int aa, int bb) {
		int ret = aa + bb;
		aa = 100;
		return ret;
	}
}
