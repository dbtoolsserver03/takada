package co.jp.saisk.utils.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import co.jp.saisk.utils.base.MyDateUtil;

public class MyFileUtils {


	public static void writeFile(String logPath, String fileNm, String enCode,
			List<String> strList) throws Throwable {
		File file = new File(logPath);
		file.mkdirs();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(logPath + fileNm), enCode));
		for (String str : strList) {
			
			writer.write(str);
			writer.newLine();
		}
		writer.close();
	}

	public static List<String> getFileContent(File f, String encode)
			throws Throwable {
		List<String> retList = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(f),
				encode));

		while (reader.ready()) {
			retList.add(reader.readLine());
		}
		reader.close();
		return retList;
	}
	public static List<String> getFileContent(String path, String encode)
			throws Throwable {
		List<String> retList = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File(path)),
				encode));

		while (reader.ready()) {
			retList.add(reader.readLine());
		}
		reader.close();
		return retList;
	}

	/**
	 * @param oldFilesMap
	 * @param newFilesMap
	 * @return
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static void copyFile(String path, String nm, String newPath,
			String newNm, String encode) throws Throwable {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(path + nm),
				encode));
		File file = new File(newPath);
		file.mkdirs();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(newPath + newNm), encode));

		while (reader.ready()) {
			writer.write(reader.readLine());
			writer.newLine();
		}

		writer.close();
		reader.close();
	}

	public static String getFileTime(File f, String format) throws Throwable {
		return MyDateUtil.getDateTime(f.lastModified(),format);
	}

	public static boolean isSameFile(File f1, File f2, String encode) throws Throwable {
		List<String> lst1 = getFileContent(f1, encode);
		List<String> lst2 = getFileContent(f2, encode);

		if (lst1.size()!=lst2.size()) {
			return false;
		}
		for (int i=0; i < lst1.size(); i++) {
			if (!lst1.get(i).equals(lst2.get(i))) {
				return false;
			}
		}
		return true;
	}
}
