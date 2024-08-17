package jp.co.yahoo.nakayama.basic;


import java.text.SimpleDateFormat;

// Dateは java.langパッケージ下のクラスではないため、
// 明示importが必要

import java.util.Date;

public class Basic12Date {

	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(now);
        System.out.println("Formatted Date: " + formattedDate);		
	}

}
