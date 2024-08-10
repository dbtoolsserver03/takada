package jp.co.yahoo.nakayama.basic;

public class Basic07Debug {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		int sum = 0;
		
		for(int num : arr) {
			sum = sum + num;
		}
		System.out.println(sum);
		
	}
}
