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

		
	}
}
