package jp.co.yahoo.basic;

public class BasicType {

	public static void main(String[] args) {

		// 6种数字类型

		//	1. 整数类型
		//	byte：8位，有符号整数，取值范围是 -128 到 127。
		byte b = 127;
		System.out.println(Byte.SIZE);
		System.out.println(b);
		//	short：16位，有符号整数，取值范围是 -32,768 到 32,767。
		short s = 32767;
		System.out.println(Short.SIZE);
		System.out.println(s);
		//	int：32位，有符号整数，取值范围是 -2^31 到 2^31 - 1。
		int i = Integer.MAX_VALUE;
		System.out.println(Integer.SIZE);
		System.out.println(i);
		//	long：64位，有符号整数，取值范围是 -2^63 到 2^63 - 1。需要在数值后加 L 或 l。
		long l = Long.MAX_VALUE;
		System.out.println(l);
		System.out.println(Long.SIZE);
		
		int m = s;
		//short a = i; 
		//如果把范围大的类型往范围小的变量里设值 是会发生溢出
		
		int x = 20;
		short sh = (short)x;// 人为强制转换
		
		long la = 123L;
		
		// int ia = 123l;
		System.out.println(la);
		
		// 浮点型
		
		
//float：32位，单精度浮点数，取值范围约为 3.4e-038 到 3.4e+038。需要在数值后加 F 或 f。
		float f = 3.14f;
		System.out.println(Float.MAX_VALUE);
		System.out.println(f);
		//double：64位，双精度浮点数，取值范围约为 1.7e-308 到 1.7e+308。默认的浮点数类型。
		double d = 3.14;
		System.out.println(Double.MAX_VALUE);
		System.out.println(d);
		
		
//	字符类型
//	char：16位，字符类型，表示一个 Unicode 字符，取值范围是 0 到 65,535。
	
			char ch = 'a';
			System.out.println(Character.MAX_VALUE);
			System.out.println(ch);
			
			// http://www3.nit.ac.jp/~tamura/ex2/ascii.html
			short sch = (short)ch;
			System.out.println(sch);
//			布尔类型
//			boolean：表示布尔值，只有两个可能的取值：true 和 false。
			
			boolean btrue = true;
			System.out.println(Boolean.TRUE);
			System.out.println(btrue);
			
			
//			基本类型	封装类
//			byte	Byte
//			short	Short
//			int	Integer
//			long	Long
//			float	Float
//			double	Double
//			char	Character
//			boolean	Boolean
			
			// 数字的初期值都是0
			int xinit = 0;
			System.out.println(xinit);
			
			// 对象初期值是NULL
			Integer xInteger=null;
			System.out.println(xInteger);
	}

}
