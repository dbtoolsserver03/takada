package jp.co.google.ssk.basic;

// java.lang
public class TestArr {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		
		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("------------");
		
		// 建议写法
		int[] arr2 = {2,3,4};
		
		for (int i : arr2) {
			System.out.println(i);
		}
		System.out.println("for each------------");

		String[] arr3 = {"hello","world"};
		
		for (String str : arr3) {
			System.out.println(str);
		}
		
		System.out.println("for i------------");

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}

}
