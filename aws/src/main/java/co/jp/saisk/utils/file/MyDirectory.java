package co.jp.saisk.utils.file;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.jp.saisk.utils.base.MyStrUtils;
public class MyDirectory {

	public static LinkedList<File> getFilesList(String filePath, boolean isHaveSubFile) {

		LinkedList<File> retList = new LinkedList<File>();
		LinkedList<File> list = new LinkedList<File>();
		File dir = new File(filePath);
		File file[] = dir.listFiles();
		if (null == file) {
		return retList;
		}

		for (int i = 0; i < file.length; i++) {

			if (file[i].isDirectory())
				list.add(file[i]);
			else
				retList.add(file[i]);
		}

		if (isHaveSubFile) {
			File tmp;
			while (!list.isEmpty()) {
				tmp = list.removeFirst();

				if (tmp.isDirectory()) {
					file = tmp.listFiles();
					if (file == null)
						continue;
					for (int i = 0; i < file.length; i++) {
						if (file[i].isDirectory())
							list.add(file[i]);
						else {
							retList.add(file[i]);
						}
					}
				} else {
					retList.add(tmp);
				}
			}
		}

		return retList;
	}

	public static LinkedList<File> getFoldersList(String filePath) {

		LinkedList<File> list = new LinkedList<File>();
		LinkedList<File> folderlist = new LinkedList<File>();
		File dir = new File(filePath);
		File file[] = dir.listFiles();

		if (file == null) {
			return folderlist;
		}
		for (int i = 0; i < file.length; i++) {

			if (file[i].isDirectory()) {
				list.add(file[i]);
				folderlist.add(file[i]);
			}
		}

		File tmp;
		while (!list.isEmpty()) {
			tmp = list.removeFirst();

			if (tmp.isDirectory()) {
				file = tmp.listFiles();
				if (file == null)
					continue;
				for (int i = 0; i < file.length; i++) {
					if (file[i].isDirectory()) {
						folderlist.add(file[i]);

						list.add(file[i]);
					}
				}
			}
		}

		return folderlist;
	}
	
	
	public static Set<String> getFileSet(String filePath, boolean isHaveSubFile) {
		Set<String> retSet = new TreeSet<String>();
		for (File f : getFilesList(filePath, isHaveSubFile)) {
			retSet.add(f.getName());
		}
		return retSet;
	}

	public static void copyFile(String fromFilePath, String toPath) throws Throwable {

		File fromFile = new File(fromFilePath);
		File toFile=new File(toPath);
		toFile.mkdirs();
		String command = "cmd /c copy "+ fromFile.getAbsolutePath() + " " + toFile.getAbsolutePath() + File.separator;
		Runtime.getRuntime().exec(command).waitFor();
	}


	public static Map<String, String> getFolderSetLike(String folderPath, String subPathReg,String commonKeyFolder) {
		Map<String,String> retMap = new TreeMap<>();
		if (folderPath.endsWith(File.separator)) {
			folderPath = folderPath.substring(0,folderPath.length()-1);
		}
		
		if (MyStrUtils.isEmpty(subPathReg)) {
			retMap.put(subPathReg, folderPath);
		} else {
			for (File f : getFoldersList(folderPath)) {
				String str = f.getAbsolutePath().substring(folderPath.length()+1);
				if (commonKeyFolder.length()==0) {
					if (MyStrUtils.isEmpty(subPathReg)) {
						retMap.put(str, f.getAbsolutePath());
					} else {
						Pattern p = Pattern.compile("("+subPathReg+")");
						Matcher m = p.matcher(str);
						if (m.find()) {
							retMap.put(m.group(),f.getAbsolutePath());
						}
					}
				} else {
					Pattern p = Pattern.compile(commonKeyFolder);
					Matcher m = p.matcher(str);
					if (m.find()) {
						retMap.put(m.group(),f.getAbsolutePath());
					}
				}
			}
		}

		return retMap;
	}



}
