package com.baidu.cls;

public class TestDuoTai {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};

		// 定义对象数组 
		// 数组里面的对象的类型，是定义数组的类型的子类或该类
		Person[] arr = {new Person(),new Japanese(),new English()};
	
		for(int i=0; i<arr.length;i++) {
			
			// 使用时，根据该对象的类，调用方法
			arr[i].say();
		}
	}
}
