package jp.co.google.ssk.clz;

import java.util.Date;

public class Cat {

	public static final String NAME_JP = "ねこ";
	public static final String NAME_EN = "cat";
	public static final String NAME_ZH = "猫";
	
	// 类的封装（把属性和方法进行封装）
	String name;
	Date birthday;
	int weight;
	
	void call() {
		System.out.println("call miao");
	}
	
	void eat() {
		System.out.println("eat fish");

	}
	
}
