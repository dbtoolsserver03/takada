package com.jingdong.bank.basic;

public class TestIfElse {

	public static void main(String[] args) {

		testIfElse();

		int a = 1;
		int b = 2;

		// 与的短路
		if (a == 0 && b++ == 2) {
			System.out.println("a==0&&b++ == 2");
		}
		System.out.println(b);

		System.out.println("--------------------");

		// 或的短路
		a = 1;
		b = 2;

		if (a == 1 || ++b == 99) {
			System.out.println("a==1 || ++b ==99");
		}
		System.out.println(b);

		System.out.println("三目运算符--------");

		// 三目运算符
		a = 11;
		b = 2;
		int c = a < b ? 3 : 100;
		System.out.println(c);

		System.out.println("switch--------");

		char ch = 'b';

		// switch 字符，整型 ，枚举
		switch (ch) {
			case 'a': {
	
				System.out.println("aaaaaa");
			}
				break;
			case 'b': {
	
				System.out.println("bbbbb");
			}
			case 'c': {
				
				System.out.println("ccccc");
			}
			default:
				System.out.println(".......");
		}

	}

	private static void testIfElse() {

		// https://www.runoob.com/java/java-if-else-switch.html#:~:text=if...else%20if...else%20%E8%AF%AD%E5%8F%A5%201%20if%20%E8%AF%AD%E5%8F%A5%E8%87%B3%E5%A4%9A%E6%9C%89%201%20%E4%B8%AA,if%20%E8%AF%AD%E5%8F%A5%E6%A3%80%E6%B5%8B%E4%B8%BA%20true%EF%BC%8C%E5%85%B6%E4%BB%96%E7%9A%84%20else%20if%20%E4%BB%A5%E5%8F%8A%20else%20%E8%AF%AD%E5%8F%A5%E9%83%BD%E5%B0%86%E8%B7%B3%E8%BF%87%E6%89%A7%E8%A1%8C%E3%80%82

	}
}
