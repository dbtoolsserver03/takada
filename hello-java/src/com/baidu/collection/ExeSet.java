package com.baidu.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class ExeSet {

	public static void main(String[] args) {
		
		Set<People> set = new TreeSet<People>();
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

		set.add(zhang3);
		set.add(li4);
		set.add(wang5);
		
		for(People p : set) {
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
