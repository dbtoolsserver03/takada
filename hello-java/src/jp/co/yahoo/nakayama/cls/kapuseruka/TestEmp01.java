package jp.co.yahoo.nakayama.cls.kapuseruka;

public class TestEmp01 {

	public static void main(String[] args) {

		Emp emp = new Emp();
		
		System.out.println(emp.no);
		System.out.println(emp.name);
		System.out.println(emp.sex);
		
		// 同じでパッケージの場合、privateのみ見えません
//		System.out.println(emp.hireDate);
		
		// Objectのメソッド勉強する
		Emp emp1 = new Emp();
		emp1.setName("a1");
		
		Emp emp2 = new Emp();
		emp2.setName("a1");
		
		System.out.println(emp1.equals(emp2));
		
	}

}
