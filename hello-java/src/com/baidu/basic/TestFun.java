package com.baidu.basic;

// 方法定义时，需要用到下面3项
// 返回值，方法名，参数（参数个数，参数类型，参数顺序）
public class TestFun {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int sum = funSum(a,b);
		
		print(sum);

		System.out.println(funSumAny("XXX",1,2,3,4,5));
		
		int aa = 5;
		if(isTwo(aa)) {
			System.out.println(aa);
		}

	}

	// 重载(方法法名相同，参数类型或个数或顺序不同)
	private static boolean isTwo(int num) {
		return num%2==0;
	}
	private static boolean isTwo(String num) {
		return false;
	}
	private static boolean isTwo(String num,int a) {
		return false;
	}
	
	private static void print(int sum) {
		System.out.println(sum);
	}

	private static int funSum(int a, int b) {
		int s = a+b;
		return s;
	}
	
	// 数组参数只能放在后，有的话，只能有一个
	private static int funSumAny(String name,int... arr) {
		
		int s = 0;
		for(int i=0;i < arr.length;i++) {
			s = s+arr[i] ;
		}
		return s;
	}
	
//	private static int funSum(int a1, int b1) {
//		int s = a+b;
//		return s;
//	}
}
