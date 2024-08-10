package jp.co.yahoo.nakayama.basic;

public class Basic06Array {

	public static void main(String[] args) {

		// 変数:array1 
		// 類型:int[]
		int[] array1 = { 1, 2, 3 };
		
		// 勧めではない書き方です。
		// 変数:array2[] 
		// 類型:int
		int array2[] = { 1, 2, 3 };
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	
		System.out.println("----------");

		// インデックス利用しないのほうが速い
		for(int num : array1) {
			System.out.println(num);
		}
		
		char[] arrayCh = { 'a', 'b', 'c',97};
		for(char ch : arrayCh) {
			System.out.println(ch);
		}
		
		
	}
}
