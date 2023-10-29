package com.baidu.file.serializ;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestGet {

	public static void main(String[] args) {

		try {
			
			// 读文件
			InputStream is = new FileInputStream(new File("temp1029.save"));
			
			ObjectInputStream ois = new ObjectInputStream(is);
			
			
			// 反序列化
			Object obj = ois.readObject();
			
			// 流关闭
			ois.close();

			MyEmp emp = (MyEmp) obj;

			System.out.println(emp.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
