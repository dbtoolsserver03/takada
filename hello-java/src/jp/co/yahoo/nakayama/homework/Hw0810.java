package jp.co.yahoo.nakayama.homework;

public class Hw0810 {

	//	JAVA
	//  1.配列の内容は{9,2,3,4,5,4}から{2,3,4,4,5,9} にしてください。
	//  2.配列の内容は{9,2,3,4,5,4}から{4,5,4,3,2,9} にしてください

	public static void main(String[] args) {

		int[] aArr = { 9, 2, 3, 4, 5, 4 };

		//		int[] aArr = { 9, 2, 3, 4, 5, 1 };
		//昇順でソートする
		for (int i = 0; i < aArr.length; i++) {
			for (int j = 0; j < aArr.length - 1; j++) {
				if (aArr[j] > aArr[j + 1]) {
					int temp = aArr[j];
					aArr[j] = aArr[j + 1];
					aArr[j + 1] = temp;
				}
			}
		}

		for (int num : aArr) {
			System.out.println(num);

		}

		System.out.println("pre --------------");
		int[] bArr = { 9, 2, 3, 4, 5, 4 };
		for (int num : bArr) {
			System.out.print(num);
		}
		for (int i = 0; i < bArr.length / 2 ; i++) {
			int temp = bArr[i];
			bArr[i] = bArr[bArr.length - 1 - i];
			bArr[bArr.length - 1 - i] = temp;
		}
		System.out.println("\naft --------------");
		for (int num : bArr) {
			System.out.print(num);
		}
	}
}
