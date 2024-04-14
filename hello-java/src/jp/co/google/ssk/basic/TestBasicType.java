package jp.co.google.ssk.basic;

public class TestBasicType {

	public static void main(String[] args) {
		
		
		// https://blog.csdn.net/weixin_42428778/article/details/109603769
		
		// JAVA 基础类型（8种）
		
		// 数值类型（整数类型）
		byte b = 4;
		short s = 1;
		int a = 10;
		long l=99999999l;
		
		// 数值类型（浮点数类型）
		float f = 1.2f;
		double d = 3.1415926;

		// 字符类型 单引号
		char ch = 'a';
		
		// 布尔类型 真，假
		boolean isOk = false;
		
		
//		l =a;
//		System.out.println(l);
		
		a = (int)l;
		System.out.println(a);
		
		
		// 强制转换有风险，用时小心
		b=(byte)l;
		System.out.println(b);
				
	}

}
