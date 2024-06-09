package com.jingdong.bank;

public class TestArr {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		// 当需要索引的时候用  索引遍历
		for (int i = 0; i < args.length; i++) {
			System.out.println(i +":"+ args[i]);
		}
		
		// 当不需要索引的时候推荐用 foreach 快 
		for (String str : args) {
			System.out.println(str);
		}
		
//		int arrInt[] = {1,2,4}; // 不推荐
		int[] arrInt = {1,2,4}; // 推荐
		
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		editArr(arrInt);
		System.out.println("-------------------");
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		String[] strArr= {"aaa","1234"};
		
	}

	// JAVA的8种基本类型是拷贝后值传递 
	// 上面以外全是引用传递（自身）
	private static void editArr(int[] arrInt) {
		arrInt[0] = 100;
	}
}
