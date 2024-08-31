package jp.co.yahoo.nakayama.cls.test;

import jp.co.yahoo.nakayama.cls.Emp;

public class TestEmp02 {

	public static void main(String[] args) {

		Emp emp = new Emp();
		
		System.out.println(emp.no);
		
		// 同じではないパッケージの場合、public 以外見えません
//		System.out.println(emp.name);
//		System.out.println(emp.sex);
//		System.out.println(emp.hireDate);
	}

}
