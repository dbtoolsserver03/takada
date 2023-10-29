package com.baidu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02ReadFile {

	public static void main(String[] args) {

		// 创建文件夹
		String folder = "C:\\work\\file\\bbb\\";

		// 文件
		File f = new File(folder + "3.txt");

		// 文件输入流 
		FileInputStream fInputStream = null;
		
		// 读输入流
		InputStreamReader inputStreamReader = null;
		// 缓冲区输入流
		BufferedReader reader = null;
		
		try {

			// 文件输出流 
			fInputStream = new FileInputStream(f);

			// 写输出流
			inputStreamReader = new InputStreamReader(fInputStream, "utf-8");

			// 缓冲区输出流
			reader = new BufferedReader(inputStreamReader);
			
			
			while (reader.ready()) {
				System.out.println(reader.readLine());
			}
			
			
		// 处理异常时，子类异常写在前面。
		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO: handle exception
		} finally {
			
			// 对于文件流的操作，最后一定要在finally块里写关闭流语句 
			try {
				reader.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------file closed");

	}

	//	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	//			new FileOutputStream(f), "utf-8"));

}
