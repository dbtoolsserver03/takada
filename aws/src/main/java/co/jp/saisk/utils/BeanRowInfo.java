package co.jp.saisk.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.jp.saisk.utils.aws.AwsS3Utils;
import co.jp.saisk.utils.base.MyStrUtils;
import co.jp.saisk.utils.file.MyDirectory;
import co.jp.saisk.utils.log.MyLog5j;

public class BeanRowInfo {

	public int rowNum = -1;
	public String caseNo = "";
	public String fileNmAReg = "";
	public String fileNmBReg = "";
	public String commonKeyFile = "";
	public String awsPathA = "";
	public String awsPathB = "";
	public String subPathAReg = "";
	public String subPathBReg = "";
	public String commonKeyFolder = "";
	public String folderPathA = "";
	public String folderPathB = "";

	public boolean isAFolderAws = false;
	public boolean isBFolderAws = false;

	public String aFolderSeparator = File.separator;
	public String bFolderSeparator = File.separator;

	public Map<String, Set<String>> aFileMap = new TreeMap<>();
	public Map<String, Set<String>> bFileMap = new TreeMap<>();

	public Map<String, String> aPathMap = new TreeMap<>();
	public Map<String, String> bPathMap = new TreeMap<>();

	public boolean isOk = false;
	public Map<String, Map<String, String>> aMapFilter = new TreeMap<>();
	public Map<String, Map<String, String>> bMapFilter = new TreeMap<>();

	public int aFileCnt = 0;
	public int bFileCnt = 0;

	public Map<String, String> noExistMap = new TreeMap<String, String>();

	public String inputInfo() {
		return "↓↓↓ inputInfo [rowNum=" + rowNum + ", caseNo=" + caseNo + ", fileNmAReg=" + fileNmAReg + ", fileNmBReg="
				+ fileNmBReg + ", commonKeyFile=" + commonKeyFile + ", awsPathA=" + awsPathA + ", awsPathB=" + awsPathB
				+ ", subPathAReg=" + subPathAReg + ", subPathBReg=" + subPathBReg + ", commonKeyFolder="
				+ commonKeyFolder + ", folderPathA=" + folderPathA + ", folderPathB=" + folderPathB + "]";
	}

	public String outputInfo() {
		return "↑↑↑ outputInfo [rowNum=" + rowNum + ", caseNo=" + caseNo + ", isOk=" + isOk + ", aMapFilter="
				+ aMapFilter
				+ ", bMapFilter=" + bMapFilter + ", noExistMap=" + noExistMap + "]";
	}

	public BeanRowInfo(int i, String info) {
		rowNum = i;
		String[] strArr = info.split(MyConst.COMA);
		caseNo = "NULL".equals(strArr[0].toUpperCase()) ? "" : strArr[0];
		fileNmAReg = "NULL".equals(strArr[1].toUpperCase()) ? "" : strArr[1];
		fileNmBReg = "NULL".equals(strArr[2].toUpperCase()) ? "" : strArr[2];
		commonKeyFile = "NULL".equals(strArr[3].toUpperCase()) ? "" : strArr[3];
		awsPathA = "NULL".equals(strArr[4].toUpperCase()) ? "" : strArr[4];
		awsPathB = "NULL".equals(strArr[5].toUpperCase()) ? "" : strArr[5];
		subPathAReg = "NULL".equals(strArr[6].toUpperCase()) ? "" : strArr[6];
		subPathBReg = "NULL".equals(strArr[7].toUpperCase()) ? "" : strArr[7];
		commonKeyFolder = "NULL".equals(strArr[8].toUpperCase()) ? "" : strArr[8];
		folderPathA = "NULL".equals(strArr[9].toUpperCase()) ? "" : strArr[9];
		folderPathB = "NULL".equals(strArr[10].toUpperCase()) ? "" : strArr[10];

		subPathAReg = MyStrUtils.trimRChar(subPathAReg, "/");
		subPathBReg = MyStrUtils.trimRChar(subPathBReg, "/");
		subPathAReg = MyStrUtils.trimRChar(subPathAReg, File.separator);
		subPathBReg = MyStrUtils.trimRChar(subPathBReg, File.separator);

		awsPathA = MyStrUtils.trimRChar(awsPathA, "/");
		awsPathB = MyStrUtils.trimRChar(awsPathB, "/");

		folderPathA = MyStrUtils.trimRChar(folderPathA, File.separator);
		folderPathB = MyStrUtils.trimRChar(folderPathB, File.separator);

		if (folderPathA.length() == 0) {
			isAFolderAws = true;
			aFolderSeparator = "/";
		}
		if (folderPathB.length() == 0) {
			isBFolderAws = true;
			bFolderSeparator = "/";
		}
		fileNmAReg = MyStrUtils.funReplace(fileNmAReg, "~", ",");
		fileNmBReg = MyStrUtils.funReplace(fileNmBReg, "~", ",");
		commonKeyFile = MyStrUtils.funReplace(commonKeyFile, "~", ",");
		subPathAReg = MyStrUtils.funReplace(subPathAReg, "~", ",");
		subPathBReg = MyStrUtils.funReplace(subPathBReg, "~", ",");
		commonKeyFolder = MyStrUtils.funReplace(commonKeyFolder, "~", ",");
	}

	public void doNotExistInB() {
		for (Entry<String, Map<String, String>> entryFilter : aMapFilter.entrySet()) {

			String pathKey = entryFilter.getKey();
			for (Entry<String, String> entryFile : entryFilter.getValue().entrySet()) {
				String fileKey = entryFile.getKey();
				String fileNm = entryFile.getValue();
				if (commonKeyFolder.length() == 0) {
					if (bMapFilter.get("").containsKey(fileKey)) {
					} else {
						noExistMap.put(fileNm, aPathMap.get(pathKey) + this.aFolderSeparator + fileNm);
					}
				} else {
					if (bMapFilter.containsKey(pathKey) && bMapFilter.get(pathKey).containsKey(fileKey)) {

					} else {
						noExistMap.put(fileNm, aPathMap.get(pathKey) + this.aFolderSeparator + fileNm);
					}
				}
			}
		}
		if (noExistMap.isEmpty()&& aFileCnt <= bFileCnt) {
			isOk = true;
		}
	}

	public void doFilefillter() throws Throwable {

		for (Entry<String, String> entryPath : aPathMap.entrySet()) {
			Map<String, String> fileNmMap = getFileFilter(entryPath.getKey(),aFileMap.get(entryPath.getKey()), fileNmAReg);
			if (MyStrUtils.isNotEmpty(fileNmMap)) {
				aMapFilter.put(entryPath.getKey(), fileNmMap);
				aFileCnt += fileNmMap.size();
			}
		}
		for (Entry<String, String> entryPath : bPathMap.entrySet()) {
			Map<String, String> fileNmMap = getFileFilter(entryPath.getKey(),bFileMap.get(entryPath.getKey()), fileNmBReg);
			if (MyStrUtils.isNotEmpty(fileNmMap)) {
				bMapFilter.put(entryPath.getKey(), fileNmMap);
//				for (Entry<String,String> entryFile : fileNmMap.entrySet()) {
//					if (entryFile.getValue().contains(MyConst.SLIP)) {
//						bFileCnt += entryFile.getValue().split(MyConst.SLIP).length;
//					} else {
//						bFileCnt++;
//					}
//				}
				bFileCnt += fileNmMap.size();
			}
		}
	}

	public void initPathBean() throws Throwable {
		aPathMap = this.isAFolderAws ? AwsS3Utils.getPathSetLike(awsPathA, subPathAReg, commonKeyFolder)
				: MyDirectory.getFolderSetLike(folderPathA, subPathAReg, commonKeyFolder);
		bPathMap = this.isBFolderAws ? AwsS3Utils.getPathSetLike(awsPathB, subPathBReg, commonKeyFolder)
				: MyDirectory.getFolderSetLike(folderPathB, subPathBReg, commonKeyFolder);
	}

	public Map<String, String> getFileFilter(String path, Set<String> fileSet, String filePattern) {
		Map<String, String> retMap = new TreeMap<>();
		for (String str : fileSet) {
			System.out.println(str.matches(filePattern) + "-->" + str + ":" + filePattern);
			if (str.matches(filePattern)) {
				Pattern p = Pattern.compile(this.commonKeyFile);
				Matcher m = p.matcher(str);
				if (m.find()) {
					String key = m.group();
//					if (retMap.containsKey(key)) {
//						str = retMap.get(key) + MyConst.SLIP + str;
//					}
					
					String yyyymmdd = "\\d{8}";
					if (MyStrUtils.isNotEmpty(this.subPathAReg) 
							&& MyStrUtils.isNotEmpty(this.fileNmBReg)
							&& this.subPathAReg.contains(yyyymmdd)
							&& this.fileNmBReg.contains(yyyymmdd)
							) {
						String matchCode = "("+MyConst.YYYYMMDD_REG+")";
						Pattern pYYYYMMDD = Pattern.compile(matchCode);
						if (this.fileNmAReg.equals(filePattern)) {
							Matcher mYYYYMMDD = pYYYYMMDD.matcher(path);
							if (mYYYYMMDD.find()) {
								retMap.put(mYYYYMMDD.group() + "_" + key, str);
							}else {
								retMap.put(key, str);
							}
									
						} else {
							Matcher mYYYYMMDD = pYYYYMMDD.matcher(str);
							if (mYYYYMMDD.find()) {
								retMap.put(mYYYYMMDD.group() + "_" + key, str);
							}else {
								retMap.put(key, str);
							}
						}
					} else {
						retMap.put(key, str);	
					}
				}else {
					retMap.put(str, str);
				}
			}
		}

		return retMap;
	}

	public void checkPattern(Map<BeanRowInfo, Throwable> ngMap) throws Throwable {

		try {
			Pattern.compile(this.commonKeyFile);
		} catch (Throwable e) {
			MyLog5j.writeLine(this.commonKeyFile);
			ngMap.put(this, e);
		}
		try {
			Pattern.compile(this.commonKeyFolder);
			
		} catch (Throwable e) {
			MyLog5j.writeLine(this.commonKeyFolder);
			ngMap.put(this, e);
		}
	}

	public void initFileMap() {
		for (Entry<String, String> entry : aPathMap.entrySet()) {
			Set<String> fileASet = isAFolderAws ? AwsS3Utils.getNameSetByS3Path(entry.getValue(), false)
					: MyDirectory.getFileSet(entry.getValue(), false);
			aFileMap.put(entry.getKey(), fileASet);
		}
		for (Entry<String, String> entry : bPathMap.entrySet()) {
			Set<String> fileASet = isBFolderAws ? AwsS3Utils.getNameSetByS3Path(entry.getValue(), false)
					: MyDirectory.getFileSet(entry.getValue(), false);
			bFileMap.put(entry.getKey(), fileASet);
		}
	}

	public List<String> getCompareRresult() {
		List<String> lst = new ArrayList<>();
		if (isOk) {
			lst.add("▽▽▽" + this.caseNo);
		} else {
			lst.add("▼▼▼" + this.caseNo);
		}
		lst.add("input  fille list :" + "(" + aFileCnt + ")");
		for (Entry<String, Map<String, String>> entry : aMapFilter.entrySet()) {
			for (Entry<String, String> entryFile : entry.getValue().entrySet()) {
				lst.add(aPathMap.get(entry.getKey()) + aFolderSeparator + entryFile.getValue());
			}
		}
		lst.add("output  fille list :" + "(" + bFileCnt + ")");
		for (Entry<String, Map<String, String>> entry : bMapFilter.entrySet()) {
			for (Entry<String, String> entryFile : entry.getValue().entrySet()) {
//				if (entryFile.getValue().contains(MyConst.SLIP)) {
//					for (String str : entryFile.getValue().split(MyConst.SLIP)) {
//						lst.add(bPathMap.get(entry.getKey()) + bFolderSeparator + str);	
//					}
//					
//				} else {
					lst.add(bPathMap.get(entry.getKey()) + bFolderSeparator + entryFile.getValue());	
//				}
				
			}
		}
		if (!isOk) {
			lst.add("ng file list :" + "(" + this.noExistMap.size() + ")");
			for (Entry<String, String> entry : this.noExistMap.entrySet()) {
				lst.add(entry.getValue());
			}
		}
		return lst;
	}

	public List<String> getPathInfo() {
		
		List<String> retLst = new ArrayList<>();
		retLst.add("------- path info ---------");
		retLst.add("path from :");
		for (Entry<String,String> entry: this.aPathMap.entrySet()) {
			retLst.add(entry.getKey()+"="+ entry.getValue());
		}
		retLst.add("path to :");
		for (Entry<String,String> entry: this.bPathMap.entrySet()) {
			retLst.add(entry.getKey()+"="+ entry.getValue());
		}
		return retLst;
	}

}
