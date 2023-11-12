package com.baidu.basic;

public class Texe {

	public static void main(String[] args) {

		runLoop();

		runIfElse();

	}

	private static void runIfElse() {

		// int a=1,b=2;
		int a = 3;
		int b = 2;
		int max = 0;

		//		if(a<b) {
		//			max=b;
		//		}

		// 三目运算符
		max = a < b ? b : max;

		System.out.println(max);

		if (a == 1) {
			System.out.println("man");
		} else if (a == 2) {
			System.out.println("man");
		} else {
			System.out.println("woman");
		}

		if (a == 1 || a == 2) {
			System.out.println("man");
		} else {
			System.out.println("woman");
		}

		if (a == 3 && b == 2) {
			System.out.println("OK");
		}

		// i++;
		int num = 0;
		// 先执行num + 1， 后执行打印
		System.out.println(++num);
		
		// 先执行打印， 后执行num + 1
		System.out.println(num++);

		System.out.println(num);

		System.out.println("短路 test 或");
		a = 3;
		num = 0;
		// 短路
		if (a == 3 || ++num < 100) {
			System.out.println(num);
		}
		System.out.println(num);

		System.out.println("短路 test 与");
		a = 3;
		num = 0;
		// 短路
		if (a == 2 && ++num < 100) {
			System.out.println(num);
		}
		System.out.println(num);

		System.out.println("---- switch ---");

		int no = 1;
		switch (no) {
			case 1:
				System.out.println("1");
				break;
			case 2:
			case 3:
				System.out.println("23");
				break;
			default:
				break;
		}
	}

	private static void runLoop() {

		//int arr[] = {1,2,3}; 不推荐 

		int[] arr = { 1, 2, 3 };

		System.out.println("for---- break;");
		for (int i = 0; i < arr.length; i++) {
			if (i==1) {
				break; // jump
			}
			System.out.println("下标：" + i + "->var:" + arr[i]);
		}

		System.out.println("for---- continue;");
		for (int i = 0; i < arr.length; i++) {
			if (i==1) {
				continue;// skip
			}
			System.out.println("下标：" + i + "->var:" + arr[i]);
		}
		//		1.int i=0
		//		2.i<arr.length;
		//		3.System.out.println("下标："+i + "->var:"+  arr[i]);
		//		4.i++;
		//		2.i<arr.length;
		//		....

		System.out.println("while----");
		int i = 0;
		while (i < arr.length) {
			System.out.println("下标：" + i + "->var:" + arr[i]);
			i++;
		}

		i = 0;
		System.out.println("do while----");
		do {

			if (i == arr.length) {
				break;
			}
			System.out.println("下标：" + i + "->var:" + arr[i]);
			i++;
		} while (true);

	}

}
