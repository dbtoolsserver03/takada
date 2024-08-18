package com.oralce.study.basic;

public class Basic07Method01 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		
		// static 方法中调用的方法也要是static
		int c  = funAdd(a,b);
		System.out.println(c);

	}

	private static int funAdd(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
