package com.oralce.study;

public class Basic07Method04 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;


		System.out.println(funAdd("2222",a, b));
		System.out.println(funAdd("3333",a, b,c));
		System.out.println(funAdd("4444",a, b,c,d));

	}

	// 
//	private static int funAdd01(int ... arr,String str) {
//		return 0;
//	}
	
	// 不定个数的参数一定要放在方法的最后面
//	private static int funAdd01(String ... s ,int ... arr) {
//		return 0;
//	}
	
	private static int funAdd(String str,int ... arr) {
		
		int sum = 0;
		for(int num : arr) {
			sum+=num;
		}
		
		return sum;
	}

}
