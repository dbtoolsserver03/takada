package com.oralce.study.cls.fz;

import java.util.Date;

// 封装
// 继承
// 多态
public class Car {
	
	// 成员，属性，字段 都是一个意思 
	
	// 最公开的，哪里都可见
	public String bland;
	
	// default 同一个包下才可见
	Date productDate;
	
	protected int width;
	
	private int height;
	
}

class Bus{
	
	public static void main(String[] args) {
		Car car = new Car();
		car.width = 100;
		//car.height = 100;
	}
}
