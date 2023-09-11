package jp.co.yahoo.study.zhang3.d0820.cls.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exe01 {

	public static void main(String[] args) {

		funOld();
		System.out.println("------------------------");
		funClass();
	}

	private static void funClass() {

		// class  类  是抽象概念
		// object 对象 是具体实物
		Emp emp = new Emp("001", new Date(), 200000, "08000001111");
		
		// 因为是public 所以的类可以任意通过成员变更直接更改成员的值
		emp.empNo="aaa";
		
		// 因为是private 避免别的类直接通过成员变更更改值的内容
		//emp.salary=1100;
		
		// Emp类提供了public 公开方法，为了让其他类通过方法更改成员内容
		emp.setSalary(80000);
		
		System.out.println(emp);
	}

	private static void funOld() {
		String empNo = "001";
		Date birthday = new Date();
		int salary = 200000;
		String tel = "08012345678";
		
		
		String str = empNo+ ","+ getStringDate(birthday)+ "," + salary+ ","+tel;
		System.out.println(str);		
	}

	public static String getStringDate(Date date) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

		String dateString = formatter.format(date);

		return dateString;

		}
}
