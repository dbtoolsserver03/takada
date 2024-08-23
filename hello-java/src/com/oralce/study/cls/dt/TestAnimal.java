package com.oralce.study.cls.dt;


public class TestAnimal {

	public static void main(String[] args) {
		
		// 多态的实现 用父类定义变量，来调用子类方法
		Animal a = new Cat();
		a.call();
		
		System.out.println("----------------");
		// 多态的应用
		Cat c = new Cat();
		Dog d = new Dog();
		
		
		Animal[] arr = {a,c,d};
		
		for (Animal animal : arr) {
			animal.call();
		}
	}
}
