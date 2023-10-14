package com.baidu.cls;

import java.util.Date;

// 类 ： 封装，继承，多态


public class Person {
	
	// 封装：封装属性，定义属性的可视范围
	// private, default,protected,public
	private String name = "aaa"; //私有属性
	int height=170; //默认属性
	protected int weight=120; //可继承属性
	public Date birthday = new Date();// 公开属性
	
	public void say() {
		System.out.println("person say");
	}

}

class B{
	
	// 私有属性不可以直接访问
//	public static void main(String[] args) {
//		
//		Person zhang3 = new Person();
//		System.out.println(zhang3.name);
//		System.out.println(zhang3.height);
//		System.out.println(zhang3.weight);
//		System.out.println(zhang3.birthday);
//		
//	}
}

