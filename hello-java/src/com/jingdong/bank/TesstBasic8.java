package com.jingdong.bank;

public class TesstBasic8 {

	// https://www.runoob.com/java/java-tutorial.html
	public static void main(String[] args) {
		
		// 关于数值的基本类型有6种 范围由小到大如下
		//整数型
		byte b = 1; // -128~127
		short s = 32767; // -32768至32767
		System.out.println(s);
		int i = 100000;
		// 超过int 范围时，要在数值后面加上字母l
		long myLong = 1000000000000l;
		
		
		// 浮点型
		// 单精度，要在数值后面加上字母f
		float f =  3.14f;
		// 双精度，要在数值后面加上字母d
		double d =  39999999999999999999999999999999999999999.141595d;
		
		// 布尔类型 只有两个值  false true;
		boolean bool = true;
		System.out.println(bool);
		
		// 字符类型
		char ch = 'a';
		System.out.println(ch);
		
		///////////////////////
		// 类型的强制转换
		
		long numLong = 10000000000000l;
		
		// 业务逻辑上是不会出现丢失数据时
		int numInt = (int)numLong;
		System.out.println(numInt);
		
		int aInt = 100;
		long aLong = aInt;
		System.out.println(aLong);
		////////////////////////////////
		System.out.println(Double.MAX_VALUE );
		
		//////  字符与整型
		char myCh = 'a';
		int myInt = myCh;
		System.out.println(myInt);
		
		//////   8种基本类型的封装类
//		byte:Byte
		System.out.println("byte:" + Byte.SIZE);
//		short : Short
		System.out.println("short:" + Short.SIZE);
//		int : Integer
		System.out.println("int:" + Integer.SIZE);
//		long : Long 
		System.out.println("long:" + Long.SIZE);
//		float : Float
		System.out.println("float:" + Float.SIZE);
//		double : Double
		System.out.println("double:" + Double.SIZE);
		
//		char : Char
		System.out.println("char:" + Character.SIZE);
//		boolean : Boolean
		System.out.println("boolean:" + Boolean.FALSE);
		
	}
}
