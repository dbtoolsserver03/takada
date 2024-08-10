package jp.co.yahoo.nakayama.basic;

public class Baisc01 {

	
	public static void main(String[] args) {
		
		
//		byte - 8ビット整数
//		[00001111] 
		byte b = 127;
		System.out.println(b);
//		short - 16ビット整数
		short s = 32767;
		System.out.println(s);
//		int - 32ビット整数
		int i = Integer.MAX_VALUE;
		System.out.println(i);
//		long - 64ビット整数
		long l = Long.MAX_VALUE;
		System.out.println(l);

		
//		float - 32ビット浮動小数点数
		
		float f = Float.MAX_VALUE;
		float pi = 3.14f;// fの明示必要
		System.out.println(f);
		
//		double - 64ビット浮動小数点数
		double d = Double.MAX_VALUE;
		double pid = 3.14;
		double pidd = 3.14d;
		System.out.println(d);
		
		
//		char - 16ビットUnicode文字
		char ch = '1';
		System.out.println("------");
		System.out.println(ch);
		
//		boolean - 真または偽の値
		
		boolean yes = true;
		boolean no = false;
		System.out.println(yes);
		System.out.println(no);
		
		
	}
}
