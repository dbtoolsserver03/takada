package com.oralce.study.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Basic06StringDate {

	public static void main(String[] args) {

		String str = "HelloWorld";
		String stra = "HelloWorld";
		String strb = new String("HelloWorld");
		String strc = new String("HelloWorld");
		System.out.println(strb);
		String a = "Hello";
		String b= "World";
		
		String s = a+b;
		
		System.out.println(strb == strc);
		
		System.out.println(str == strb);
		System.out.println(str == stra);
		
		System.out.println(str == s);
		
		System.out.println(str.equals(s));
		
		System.out.println(s);

		System.out.println(str.contains("laalo"));

		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = dateFormat.format(date);
		
		System.out.println(strDate);
		
	}

}
