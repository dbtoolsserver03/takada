package jp.co.yahoo.nakayama.io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {

		File f = new File("C:\\file\\0914");
		//f.mkdirs();
		System.out.println(f.delete());
		System.out.println(f.exists());
	}

}
