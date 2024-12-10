package jp.co.yahoo.nakayama.basic;

public class Baisc02 {

	
	public static void main(String[] args) {
		

		int numberInt = 0;
		// lの明示必要 ※lがない場合、intの最大値です
		long numberLong = 1234567890123456l;

		System.out.println("##########");
		numberInt = (int)numberLong;
		System.out.println(numberInt);
		System.out.println("##########");

		
		char ch = '$';
		int num = ch;
		System.out.println(num);
		
		
		System.out.println("------------------");
		System.out.println(Byte.SIZE); // byte  のラッパークラス
		System.out.println(Short.SIZE);// short のラッパークラス
		System.out.println(Integer.SIZE);// int のラッパークラス
		System.out.println(Long.SIZE);// long のラッパークラス
		System.out.println(Float.SIZE);// float のラッパークラス
		System.out.println(Double.SIZE);// double のラッパークラス
		
		System.out.println(Character.SIZE);// char のラッパークラス
		
		System.out.println(Boolean.TRUE);// boolean のラッパークラス
		
		int numInt = 1;
		
		Integer numInteger = 1;
		
		
	}
}
