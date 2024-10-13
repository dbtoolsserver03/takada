package jp.co.yahoo.basic;

public class BasicLife {

	public static void main(String[] args) {
		
		// 娈数的生命周期只限大括号内
		for (int i = 0; i < 10; i++) {
			
		}
		
		{
			int x = 100;
		}
		
		// 下面的变量看不到了
//		System.out.println(i);
//		System.out.println(x);
	}

}
