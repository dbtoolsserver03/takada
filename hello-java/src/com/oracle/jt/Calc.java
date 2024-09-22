package com.oracle.jt;

public class Calc {

	public static int funCalc(int a, int b, char ch) {

		int ret = 0;

		if (ch == '+') {
			ret = a + b;
		} else if (ch == '-') {
			ret = a - b;
		} else if (ch == '*') {
			ret = a * b;
		} else if (ch == '/') {
			ret = a / b;
		}

		int x = 1;
		int y = 2;

		if (x > y) {
			System.out.println("xxx");
		}

		return ret;
	}

}
