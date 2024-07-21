package co.jp.saisk.exe.aws;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import co.jp.saisk.utils.BeanRowInfo;
import co.jp.saisk.utils.MyConst;
import co.jp.saisk.utils.base.MyDateUtil;
import co.jp.saisk.utils.file.MyFileConst;
import co.jp.saisk.utils.file.MyFileUtils;
import co.jp.saisk.utils.log.MyLog5j;

public class CompareFileLst {
	public static String PROPERTIES_FOLDER = "tmp/aws_test";
	public static String PROPERTIES_FILE = "a01.csv";
	public static int retCode = 0;
	public static int okCnt = 0;
	public static int ngCnt = 0;
	
	
	private static void initProperties(String[] args) {
		if (args ==null || args.length==0) {
			System.out.println("propertiesファイルを指定ください");
		}
		PROPERTIES_FILE=args[0];
	}
	public static void main(String[] args) {
		
		Date begin = new Date();
		
		try {
			
			initProperties(args);
			String toolPath = new File("").getCanonicalPath() + File.separator ;
			MyLog5j.init(toolPath+"log", "debug.txt", MyFileConst.ENCODE_UTF_8);
			run();
		} catch (Throwable e) {
			retCode = 2;
			e.printStackTrace();
			try {
				for (StackTraceElement obj : e.getStackTrace()) {
					MyLog5j.writeLine(obj.toString());
				}
			} catch (Throwable e2) {
				e2.printStackTrace();
			}
		} finally {
			Date end = new Date();
			try {
				MyLog5j.writeLine("---------------------------");
				MyLog5j.writeLine("OK CASE CNT :" + "(" + okCnt+")");
				MyLog5j.writeLine("NG CASE CNT :" + "(" + okCnt+")");
				if (retCode!=0) {
					MyLog5j.writeLine("ERROR OCCURED !");
				}
				MyLog5j.writeLine("---------------------------");
				MyLog5j.writeLine("begin at :" + MyDateUtil.getFormatDateTime(begin,MyConst.YYYYMMDDHHMMSSSSS));
				MyLog5j.writeLine("end   at :" + MyDateUtil.getFormatDateTime(end,MyConst.YYYYMMDDHHMMSSSSS));
				MyLog5j.writeLine("cost time:" + MyDateUtil.getMsHour(end.getTime()-begin.getTime()));
				MyLog5j.writeLine(MyConst.s_version);
				MyLog5j.close();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void run() throws Throwable {
		

		File inputFile = new File(PROPERTIES_FOLDER  +File.separator+PROPERTIES_FILE);

		List<String> strLst = MyFileUtils.getFileContent(inputFile, MyFileConst.ENCODE_UTF_8);
		
		Map<BeanRowInfo,Throwable> ngMap = new LinkedHashMap<>();
		List<BeanRowInfo> lst = new ArrayList<>();
		
		for (int i=0; i< strLst.size(); i++) {

			
			if (i<1) {
				continue;
			}
			BeanRowInfo bean = new BeanRowInfo(i,strLst.get(i));
			bean.checkPattern(ngMap);
			lst.add(bean);
		}
		if (ngMap.size()>0) {
			MyLog5j.writeLine("■■■ common key 正式表示をチェック失敗しました。");
			for (Entry<BeanRowInfo,Throwable> entry : ngMap.entrySet()) {
				MyLog5j.writeLine(entry.getKey().inputInfo());
				MyLog5j.writeLine(entry.getValue().getMessage());
				for (StackTraceElement obj : entry.getValue().getStackTrace()) {
					MyLog5j.writeLine(obj.toString());
				}
			}
			return ;
		}
		
		
		for ( BeanRowInfo bean : lst) {
			try {
				MyLog5j.writeLine("■■■"+bean.caseNo + " start");
				MyLog5j.writeLine(bean.inputInfo());
				bean.initPathBean();
				printInfo(bean.getPathInfo());

				bean.initFileMap();
				bean.doFilefillter();
				bean.doNotExistInB();
				MyLog5j.writeLine(bean.outputInfo());
				MyLog5j.writeLine("■■■"+bean.caseNo + " end");
				
				
			} catch (Throwable e) {
				MyLog5j.writeLine(e.getMessage());
				for (StackTraceElement obj:e.getStackTrace()) {
					MyLog5j.writeLine(obj.toString());
				}
			}
			
		}
		MyLog5j.writeLine("---------------------------");
		

		for (BeanRowInfo bean : lst) {
			if (bean.isOk) {
				okCnt++;
			} else {
				ngCnt++;
			}
		}

		MyLog5j.writeLine("OK CASE LIST :" + "(" + okCnt + ")");
		for (BeanRowInfo bean : lst) {
			if (bean.isOk) {
				for (String str : bean.getCompareRresult()) {
					MyLog5j.writeLine(str);
				}
			}
		}
		MyLog5j.writeLine("---------------------------");
		MyLog5j.writeLine("NG CASE LIST :" + "(" + ngCnt + ")");
		for (BeanRowInfo bean : lst) {
			if (!bean.isOk) {
				for (String str : bean.getCompareRresult()) {
					MyLog5j.writeLine(str);
				}
			}
		}
	}
	private static void printInfo(List<String> lstInfo) throws Throwable {
		for (String str : lstInfo) {
			MyLog5j.writeLine(str);
		}
	}
}
