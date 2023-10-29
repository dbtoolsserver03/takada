package com.baidu.file;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public TestFile() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	public static void main(String[] args) {
		
		System.out.println("study file class");
		
		
		File file = new File("C:\\work\\file\\bbb");
		
		
		file.mkdirs();
		
		File f1 = new File("C:\\work\\file\\bbb\\"+"1.txt");
//		f1.renameTo(new File("2.txt"));
		
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	
	}
}
	