package jp.co.yahoo.nakayama.cls.kapuseruka.test;

import java.util.Date;

import jp.co.yahoo.nakayama.cls.kapuseruka.Emp;

public class TestEmp02 {

	public static void main(String[] args) {

		Emp emp = new Emp("001","tanaka",1,new Date());
		
		System.out.println(emp.no);
		
		// 同じではないパッケージの場合、public 以外見えません
//		System.out.println(emp.name);
//		System.out.println(emp.sex);
//		System.out.println(emp.hireDate);

		// getter setter利用し、見えない項目取得できる
		System.out.println(emp.getName());
		System.out.println(emp.getSex());
		System.out.println(emp.getHireDate());
	}

}
