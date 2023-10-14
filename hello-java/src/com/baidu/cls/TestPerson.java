package com.baidu.cls;

public class TestPerson {

	public static void main(String[] args) {
		
		Person zhang3 = new Person();
		// 私有属性不可以直接访问
		//System.out.println(zhang3.name);
		System.out.println(zhang3.height);
		System.out.println(zhang3.weight);
		System.out.println(zhang3.birthday);
		
		zhang3.say();
	}

}
