package com.jingdong.bank;

public class TestLife {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		// 变量i的生命周期 是在for语句里，所以下面的写法是不对的。
//		System.out.println(i);
		
		{
			int sum = 100;
			System.out.println(sum);
		}
		// sum 的生命周期是在大括号里，所以下面的写法是不对的。
//		System.out.println(sum);
		
		int a = 1;
		int b =2;
		
		if(a<b) {
			int c = 1;
		}
		// 变更c 的生命周期是在大括号里，所以下面的写法是不对的。
//		System.out.println(c);
	}

}
