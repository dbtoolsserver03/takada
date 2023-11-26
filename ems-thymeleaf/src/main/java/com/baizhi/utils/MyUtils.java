package com.baizhi.utils;

public class MyUtils {

	public MyUtils() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static int getNumber(String str, int x, int y) {

		int ret = 0;
		if ("*".equals(str)) {
			ret = x * y;
		} else {
			ret = x + y;
		}

		int a = 10;

		if (a > 100) {
			System.out.println(222);
		}
		return ret;

	}

}
