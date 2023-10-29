package com.baidu.file.serializ;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestPut {

	public static void main(String[] args) {
		
		
		try {
			
			MyEmp emp = new MyEmp("001", "li4", new Date());
		
			
			OutputStream os = new FileOutputStream(new File("temp1029.save"));

		    ObjectOutputStream oos = new ObjectOutputStream(os);
		    
		    
		    // 序列化
		    oos.writeObject(emp);
		    oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
}
