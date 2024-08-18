package com.oralce.study.cls.fz;

import java.util.Date;

public class TestCar01 {

	public static void main(String[] args) {

		Car car = new Car();
		car.bland = "byd";
		car.width = 1800;
		// 私有属性不可视
		//car.height = 1550;
		car.productDate = new Date();
		
		
		// 封装带来的好处
		print(car.bland,car.width,car.productDate);
		print(car);
	}

	private static void print(String bland, int width, Date productDate) {
		System.out.println(bland);
	}

	private static void print(Car car) {
		
		System.out.println(car.bland);
	}

}
