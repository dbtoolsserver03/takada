package jp.co.yahoo.nakayama.cls.kapuseruka;

public class TestEmp01 {

	public static void main(String[] args) {

		Emp emp = new Emp();
		
		System.out.println(emp.no);
		System.out.println(emp.name);
		System.out.println(emp.sex);
		
		// 同じでパッケージの場合、privateのみ見えません
//		System.out.println(emp.hireDate);
	}

}
