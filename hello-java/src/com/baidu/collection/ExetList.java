package com.baidu.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ExetList {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "bbb";
		
		System.out.println(str1.compareTo(str2));
		
		
		List<People> lst = new ArrayList<People>();
		People zhang3 = new People();
		zhang3.setName("zhang3");
		zhang3.setHeight(170);
		zhang3.setBirthday(getDate("2001/03/02","yyyy/MM/dd"));
		
		People li4 = new People();
		li4.setName("li4");
		li4.setHeight(175);
		li4.setBirthday(getDate("1991/01/01","yyyy/MM/dd"));
		

		People wang5 = new People();
		wang5.setName("wang5");
		wang5.setHeight(195);
		wang5.setBirthday(getDate("1993/11/01","yyyy/MM/dd"));

		lst.add(zhang3);
		lst.add(li4);
		lst.add(wang5);
		
		Collections.sort(
				lst, 
	            new Comparator<People>() {
	                @Override
	                public int compare(People obj1, People obj2) {
	                    return obj1.getHeight()-obj2.getHeight();
	                    // return obj1.getBirthday().compareTo(obj2.getBirthday());
	                }
	            }
	        );
		
		for(People p : lst) {
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
