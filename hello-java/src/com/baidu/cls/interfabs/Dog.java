package com.baidu.cls.interfabs;

public class Dog implements Animal{

	@Override
	public void sleep() {
		System.out.println("dog sleep");
	}

	@Override
	public void run() {
		System.out.println("dog run");
	}

}
