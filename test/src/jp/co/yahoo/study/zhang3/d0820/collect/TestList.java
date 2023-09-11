package jp.co.yahoo.study.zhang3.d0820.collect;

import java.util.ArrayList;
import java.util.List;

import jp.co.yahoo.study.zhang3.d0820.cls.jicheng.Dog;
import jp.co.yahoo.study.zhang3.d0820.cls.jicheng.DogMan;
import jp.co.yahoo.study.zhang3.d0820.cls.jicheng.DogWoman;

public class TestList {

	public static void main(String[] args) {

		// 定长数组，不可以改变数组长度
		int[] arr = {11,2,3};
		arr[1]=100;
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		// LIST 可变数组，可以改变长度
		
		// 用接口声明LIST变量里只能存放STRING类型的对象
		List<String> lst = new ArrayList<>();
		
		lst.add("hello");
		lst.add("world");
		lst.add("good");
		lst.add("morning");
		
		// 
		//lst.add(123);
		for(String str : lst) {
			System.out.println(str);
		}
		
		System.out.println("==============");
		Dog dog1 = new Dog();
		dog1.setName("dog");
		Dog dog2 = new DogMan();
		dog2.setName("DogMan");
		Dog dog3 = new DogWoman();
		dog3.setName("DogWoman");
		
		List<Dog> dogLst = new ArrayList<>();
		dogLst.add(dog1);
		dogLst.add(dog2);
		dogLst.add(dog3);
		
		
		dogLst.get(1).setName("dog man update name");
		
		for(Dog dog : dogLst) {
			System.out.println(dog.getName());
		}
		
	}

}
