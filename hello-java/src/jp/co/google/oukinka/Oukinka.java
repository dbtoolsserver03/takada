package jp.co.google.oukinka;

public class Oukinka {

public static void main(String[]args) {
	// 每个变量定义占一行
			//long aa =2,bb=3;

			int a = 1;
			int b = 7;

			int sum = add(a, b);

			System.out.println(sum);
			System.out.println(a);

		}

		private static int add(int aa, int bb) {
			int ret = aa + bb;
			aa = 100;
			return ret;
		}
	}

// 