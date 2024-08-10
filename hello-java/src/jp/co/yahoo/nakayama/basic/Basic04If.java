package jp.co.yahoo.nakayama.basic;

// alt + shift + r
public class Basic04If {

	public static void main(String[] args) {

		// if文
		int age = 10;

		
		if (age < 10) {
			System.out.println("10より小さい");
		}
		
		
		if (age < 10) {
			System.out.println("10より小さい");
		} else {
			System.out.println("10より大きい");
		}


		
		if (age < 10) {
			System.out.println("10より小さい");
		} else if(age < 20 && age > 15) {
			System.out.println("15～20");
		}

		
		if (age < 10) {
			System.out.println("10より小さい");
		} else if(age < 20 && age > 15) {
			System.out.println("15～20");
		} else {
			System.out.println(".....");
		}
		

		// 書き方勧めではない（1行は1変数）
		// int aa = 2, bb=3;
		
		int a = 1;
		int b = 2;
		int max = 0;
		
		if(a<b) {
			max = b;
		} else {
			max = a;
		}
		
		System.out.println(max);
		
		
		// a<b true の場合  bで 設定する
		// a<b false の場合 aで 設定する
		// ?の前は条件 条件はtrue の場合、:前の値で設定
		// ?の前は条件 条件はfalseの場合、:後ろの値で設定
		
		max = a < b ? b : a;
		System.out.println(max);
		
		
		int num = 0;
		if (++num < 10) {
			System.out.println("++num < 10 : num ->" + num);
		}
		
		System.out.println("---------------------");
		
		
		num = 0;
		a = 1;
		b = 2;	
		
		// ロジック && かつ　全部の条件満足が必要
		if (a < b && num == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// ロジック || 或いは
		if (a < b || num == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		num = 0;
		a = 1;
		b = 2;	
		// a<bはtureのため、後ろの条件などをスキップする
		if (a < b || ++num < 10) {

		}
		System.out.println(num);
		
		
		num = 0;
		a = 1;
		b = 2;	
		if (a > b && ++num < 10) {

		}
		System.out.println(num);
		
		
		System.out.println("$$$$$$$$$$$$$");
		char ch = 'b';

		// case後ろに break;文ほぼ必要
		switch (ch) {
			case 'a':
				System.out.println("a");
				break;
			case 'b':
			case 'c':
				System.out.println("bc");
				break;
			case 'd':
				System.out.println("d");
				break;
			default:
				System.out.println("該当しない");
		}
		
		System.out.println("end...");
		
	}

}
