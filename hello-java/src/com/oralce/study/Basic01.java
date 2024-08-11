package com.oralce.study;

public class Basic01 {

	public static void main(String[] args) {

		// java 8种基本类型
//		byte
		byte b = 127;
		
//		short
		short s = 32767;
		System.out.println(Short.MAX_VALUE);
//		int
		
		int i = 2147483647;
		System.out.println(Integer.MAX_VALUE);
//		long
		long l = 9223372036854775807l;
		System.out.println(Long.MAX_VALUE);
		
//		float
		float pi = 3.14f;
		System.out.println(Float.MAX_VALUE);
//		double
		double piD = 3.14d;
		System.out.println();
//		char
		char ch = '!';
		char ch2 = 101;
		System.out.println(ch2);
		
//		boolean
		boolean yes = true;
		boolean no = false;
		System.out.println(Boolean.FALSE);
		
		System.out.println("-----------");
		
		int num = 100;
		long longNum = 922334775807l;
		
		// OK
		// longNum = num;
		
		// NG
		// 强制转换时需要注意运行时的值 是否会超过接收变量的范围
		num = (int)longNum;
		
		System.out.println(num);
	}

}
