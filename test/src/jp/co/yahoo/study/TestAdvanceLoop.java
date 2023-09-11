package jp.co.yahoo.study;

public class TestAdvanceLoop {

	public static void main(String[] args) {

		// 输出不能被5整除的偶数
		for(int i=0; i< 50;i++) {
			if (i%2==0&&i%5!=0) {
				System.out.println(i);
			}
		}
		System.out.println("----- continue  ---------");
		for(int i=0; i< 50;i++) {
			
			if(i%5==0) {
				continue;
			}
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----- break  ---------");
		for(int i=1; i< 50;i++) {
			if(i%3==0) {
				break;
			}
			System.out.println(i);
		}
		
		int[] arr = {23,12,22,13};
		
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int num : arr) {
			System.out.println(num);
		}
		
	}

}
