package jp.co.yahoo.nakayama.basic;

public class basic05Loop {

	public static void main(String[] args) {

		// 1..100 add

		// for
		int sum = 0;

		// step1.int i = 1
		// step2.i <= 100;
		// step3.for{}のソースを実行する。
		// step4.i++
		// step5.step2
		for (int i = 1; i <= 100; i++) {
			//sum += i;
			sum = sum + i;
		}
		System.out.println("for:" + sum);

		// 現場では、while,do whileはあまり使わない
		// while
		int i = 1;
		sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("while:" + sum);

		// do while
		i = 1;
		sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 100);
		System.out.println("do while:" + sum);

		
		
		
		// if sum > 1000 の場合、sumの値を出力
		sum = 0;
		for (int index = 0; index <= 100; index++) {

			sum = sum + i;
			
			if (sum > 1000) {
				break;
			}
		}
		
		System.out.println(sum);
		
		
		// 1..10のsum    if iは2～9の数字は計算対象外
		sum = 0;
		for (int index = 0; index <= 10; index++) {

			if (index >= 2 && index <= 9) {
				continue;
			}
			sum = sum + index;
		}
		
		System.out.println(sum);
		
		
	}
}
