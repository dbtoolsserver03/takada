package com.oralce.study;

public class Basic03Loop {

	public static void main(String[] args) {
		
		// 1..100  add
		int sum = 0;
		// for
		for(int i = 0; i<= 100;i++) {
			//sum+=i; 这种写法和下面的写法等同
			sum =sum + i;
		}
		System.out.println(sum);
		
		
		//  以下循环尽量不用，容易忘写i++
		// while
		int i = 0;
		sum = 0;
		while(i<=100) {
			sum +=i;
			++i;
		}
		System.out.println(sum);
		
		// do while
		i = 0;
		sum = 0;
		do {
			sum +=i;
			++i;
		} while(i<=100);
		System.out.println(sum);
	}
}
