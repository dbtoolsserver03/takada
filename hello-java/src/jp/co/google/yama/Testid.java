package jp.co.google.yama;

public class Testid {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("yama");
		int a = 2;
		int b = 3;
		int num = 100;
		int c = add(a, b);

		System.out.println(c);
		int he = forHe(num);
		System.out.println(he);

	}

	private static int forHe(int num) {
		for (int i = 1; i < num; i++) {

			num += i;
		}
		return num;
	}

	private static int add(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		int c = a + b;;
		for(int i=0;i<100;i++) {
			
		}
		return c;
	}

}
