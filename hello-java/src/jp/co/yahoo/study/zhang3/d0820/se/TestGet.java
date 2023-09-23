package jp.co.yahoo.study.zhang3.d0820.se;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestGet {


	public static void main(String[] args) {
		
		
		try {
			Object obj = funGet("temp.save");
			 
			MyEmp emp = (MyEmp)obj;
			
			System.out.println(emp.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	private static Object funGet(String fileNm) throws Exception {
			InputStream os = new FileInputStream(new File(fileNm));
			return deserialize(os);
	}

	public static Object deserialize(InputStream in) throws IOException, ClassNotFoundException {
	    ObjectInputStream ois = new ObjectInputStream(in);
	    Object obj = ois.readObject();
	    ois.close();
	    return obj;
	}
	
}
