package co.jp.saisk.utils.log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class MyLog5j {
	public static BufferedWriter s_log5j = null;
	public  static void init(String logPath,String fileNm, String enCode) throws Throwable {
		File file = new File(logPath);
		file.mkdirs();
		s_log5j = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(logPath +File.separator+ fileNm), enCode));
	}

	public static void close() throws Throwable {
		// TODO Auto-generated method stub
		if (s_log5j != null) {
			s_log5j.close();
			s_log5j=null;
		}
	}

	public static void writeLine(String line) throws Throwable {
		System.out.println(line);
		s_log5j.write(line);
		s_log5j.newLine();
		s_log5j.flush();
		
	}
}
