package com.baidu.basic;

public class TestBasicType {
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
 
    public static void main(String[] args) {
    	
//    	System.out.println("hello"+"world"+2003);
    	
    	// 关于数字需要注意 大类型往小类型转换时，可能出现问题
//    	long numLong = 9223372036854775807l;
//    	int numInt = (int)numLong;
//    	System.out.println(numInt);
    	
    	// 关于字符 ASCIIコード表
//    	https://www.k-cube.co.jp/wakaba/server/ascii_code.html
//    	char cha = 'a';
//    	int chInt=(int)cha;
//    	System.out.println("char:"+cha);
//    	System.out.println("int:"+chInt);

    	int num1 = 126;
    	char chTmp = (char)num1;
    	System.out.println(chTmp);
//    	
//        System.out.println("Bool :" + bool);
//        System.out.println("Byte :" + by);
//        System.out.println("Character:" + ch);
//        System.out.println("Double :" + d);
//        System.out.println("Float :" + f);
//        System.out.println("Integer :" + i);
//        System.out.println("Long :" + l);
//        System.out.println("Short :" + sh);
//        System.out.println("String :" + str);
    }
}
