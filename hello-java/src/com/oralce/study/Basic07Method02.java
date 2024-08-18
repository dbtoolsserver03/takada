package com.oralce.study;

public class Basic07Method02 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		// JAVA的基本类型作为参数传递时，是值拷贝
		funAdd(a, b);

		System.out.println(a);

	}

	private static int funAdd(int a, int b) {
		int sum = a + b;
		a = 100;
		return sum;
	}

}
