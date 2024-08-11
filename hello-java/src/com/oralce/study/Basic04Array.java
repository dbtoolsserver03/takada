package com.oralce.study;

public class Basic04Array {

	public static void main(String[] args) {

		// 变量 arr01
		// 类型 int[]
		int[] arr01 = {1,2,3,5,'a'};
		
		// 变量 arr02[]
		// 类型 int
		// 这种数组定义方式不推荐
		// int arr02[] = {1,2,3,5};
		for(int i = 0; i< arr01.length;i++) {
			System.out.println(arr01[i]);
		}
		
		// 下面的写法效率高
		for(int num : arr01) {
			System.out.println(num);
		}
		
		// 数组的长度在定义时就已经固定了。
		// 容量不够时，需要重新分配空间
		int n = fun();
		arr01 = new int[n];
		
	}
	
	static int fun() {
		return 10;
	}

}
