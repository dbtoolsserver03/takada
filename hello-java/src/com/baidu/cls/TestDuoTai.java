package com.baidu.cls;

import java.util.Date;

public class TestDuoTai {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};

		// 定义对象数组 
		// 数组里面的对象的类型，是定义数组的类型的子类或该类
		
		// ctrl+t 看阶乘
		Person[] arr = {new Person(),new Japanese(),new English()};
	
		for(int i=0; i<arr.length;i++) {
			
			// 使用时，根据该对象的类，调用方法
			arr[i].say();
		}
		
		System.out.println("-----------------");
		// 数组里面的对象的类型，是定义数组的类型的子类或该类
		Object[] arrObj = {new Person(),new Japanese(),new English(),new Date()};
	
		for(int i=0; i<arrObj.length;i++) {
			
			Object obj = arrObj[i];
			
			if (obj instanceof Japanese) {
				Japanese objPerson = (Japanese)obj;
				objPerson.say();
				System.out.println("あいうえお");
			} else if (obj instanceof Person) {
				Person objPerson = (Person)obj;
				objPerson.say();
				//((Person)obj).say();
			} else if(obj instanceof Date) {
				System.out.println(obj);
			}
			
		}
		
		
	}
}
