package com.oralce.study.basic;

public class Basic07Method03 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		long aa = 1;
		long bb = 2;
		
		// 方法的重载
		
//		方法重载的规则
//		参数的数量不同：可以通过改变参数的数量来区分方法。
//		参数的类型不同：可以通过改变参数的类型来区分方法。
//		参数的顺序不同：如果参数类型不同，参数的顺序也可以用来区分方法。
//		注意：返回类型的不同或访问修饰符的不同并不能作为方法重载的依据。
		int c = funAdd(a, b);
		long cc = funAdd(aa,bb);

		System.out.println(c);
		System.out.println(cc);

	}

	private static long funAdd(long aa, long bb) {
		long sum = aa + bb;
		return sum;
	}

	private static int funAdd(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
