package com.baidu.cls.t;

import com.baidu.cls.Person;

public class TestPerson1 {

	public static void main(String[] args) {
		
		Person zhang3 = new Person();
		
		// 不同包调用时，只能调用public属性
//		System.out.println(zhang3.name);
//		System.out.println(zhang3.height);
//		System.out.println(zhang3.weight);
		System.out.println(zhang3.birthday);
	}

}
