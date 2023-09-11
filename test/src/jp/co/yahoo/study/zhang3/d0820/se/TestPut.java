package jp.co.yahoo.study.zhang3.d0820.se;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestPut {

	public static void main(String[] args) {
		
		
		try {
			
			MyEmp emp = new MyEmp("001", "li4", new Date());
			funPut(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	private static void funPut(MyEmp emp) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
			OutputStream os = new FileOutputStream(new File("temp.save"));
			
			serialize(emp, os);
	}
	
	
	public static void serialize(Object obj, OutputStream out) throws IOException {
	    ObjectOutputStream oos = new ObjectOutputStream(out);
	    oos.writeObject(obj);
	    oos.close();
	}
	
}
