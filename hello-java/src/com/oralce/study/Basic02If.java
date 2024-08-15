package com.oralce.study;

public class Basic02If {

	public static void main(String[] args) {

		// 一行定义一个变量，不要一行做多件事情
		//int a = 1,b=2;
		int a = 1;
		int b = ++a; // 2
		int c = a++; // 1

		int num = 1;
		//if else
		
		if(num<10) {
			System.out.println("num<10");
		}
		
		if(num<10) {
			System.out.println("num<10");
		} else {
			System.out.println(" ! num<10");
		}
		
		if(num<10) {
			System.out.println("num<10");
		} else if(num>15 && num<20) {
			System.out.println("num>15 && num<20");
		} else {
			System.out.println(" ....");
		}
		
		
		int aa = 1;
		int bb = 2;
		
		int max=0;
		
		
//		if (aa<bb) {
//			max = bb;
//		} else {
//			max = aa;
//		}
		
		// 三目运算符
//		？左边的表达式 如果成立，就用「：」左边的复制
//		？左边的表达式 如果不成立，就用「：」右边的复制
		max = aa < bb ? bb : aa;
		
		System.out.println(max);
		
		
		int x = 1;
		int y =2;
		
		if(x==1 && y==2) {
			System.out.println(true);
		}
		if(x==3 || y==2) {
			System.out.println("x==3 || y==2");
		}
		
		x=1;
		y=2;
		
		// 与短路
		if (x == 9 && ++y > 0) {

		}

		// 或短路
		if (x == 1|| ++y > 0) {

		}
		
		System.out.println(y);
		
		
		
		// switch 里面所有CASE语句，后面要加break;
		char ch = 'b';
		switch (ch) {
			case 'a':
				System.out.println("a");
				break;
			case 'b':
			case 'c':
				System.out.println("bc");
			case 'd':
				System.out.println("d");
				break;
			default:
				System.out.println("others");
		}
	}

}
