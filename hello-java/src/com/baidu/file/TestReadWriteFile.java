package com.baidu.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TestReadWriteFile {

	public static void main(String[] args) throws Throwable {
		
		// 要写入文件的字符串LIST
		List<String> strList = new ArrayList<String>();
		strList.add("你好");
		strList.add("hello");
		strList.add("たなか");
		
		
		// 创建文件夹
		String folder = "C:\\work\\file\\bbb\\";
		File file = new File(folder);
		file.mkdirs();
		
		// 文件
		File f = new File(folder + "2.txt");
		
		// 文件输出流 
		FileOutputStream  fOutputStream = new FileOutputStream(f);

		// 写输出流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fOutputStream,"utf-8");

		// 缓冲区输出流
		BufferedWriter writer = new BufferedWriter(outputStreamWriter);
		
		// 循环执行写操作
		for (String str : strList) {
			writer.write(str);
			writer.newLine();
			writer.flush();
		}
		
		// 关闭文件
		writer.close();
		
		
	}
	

//	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
//			new FileOutputStream(f), "utf-8"));

}
