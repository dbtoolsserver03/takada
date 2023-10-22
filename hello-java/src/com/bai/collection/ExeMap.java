package com.bai.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ExeMap {

	public static void main(String[] args) {
		
		// 整数转字符串定长
		int n=172;
		System.out.println(String.format("aaa%05d %03d", n,1));
		
		
		
		
		Map<String,People> map = new TreeMap<String,People>();
		
		
		
		People zhang3 = new People();
		zhang3.setName("zhang3");
		zhang3.setHeight(178);
		zhang3.setBirthday(getDate("2001/03/02","yyyy/MM/dd"));
		
		People li4 = new People();
		li4.setName("li4");
		li4.setHeight(175);
		li4.setBirthday(getDate("1991/01/01","yyyy/MM/dd"));
		

		People wang5 = new People();
		wang5.setName("wang5");
		wang5.setHeight(195);
		wang5.setBirthday(getDate("1993/11/01","yyyy/MM/dd"));

		
		map.put(String.format("%03d", zhang3.getHeight()) , zhang3);
		map.put(String.format("%03d", li4.getHeight()), li4);
		map.put(String.format("%03d", wang5.getHeight()), wang5);
		
		for(People p : map.values()) {
			System.out.println(p);
		}
	}

	private static Date getDate(String ymd,String format) {
		SimpleDateFormat sdFormat = new SimpleDateFormat(format);
		Date date=null;
		try {
			date = sdFormat.parse(ymd);
			
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return date;
	}
}
