package jp.co.google.yama.cla;

import java.util.Date;

public class Cat {
	public static final String NAMW_CH = "mao";
	public static final String NAME_EN = "cat";
	public static final String NAME_JP = "ねこ";
	//	属性、メソッドをパッケージする
	//	
	public String name;
	Date birthday;
	int weight;

	void call() {
		System.out.println("miao");

	}

	void eat() {
		System.out.println("eating");
	}

}
