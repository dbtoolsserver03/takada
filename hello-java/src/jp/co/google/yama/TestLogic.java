package jp.co.google.yama;

public class TestLogic {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int max = getMax(a, b);
		System.out.println(max);
		getDayInfo(a);
System.out.println(a++);
System.out.println(a);
		// TODO 自動生成されたメソッド・スタブ

	}

	private static void getDayInfo(int a) {
		switch (a/100) {
		case 1:
			System.out.println("monday");

			break;
		case 2:
			System.out.println("wensday");
			break;
		default:
			break;
		}// TODO 自動生成されたメソッド・スタブ

	}

	private static int getMax(int a, int b) {
		int max;
		if (a < b) {
			max = b;
		} else {
			max = a;
		}

		// TODO 自動生成されたメソッド・スタブ
		return max;
	}

}
