package co.jp.saisk.utils.base;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.jp.saisk.utils.MyConst;
import co.jp.saisk.utils.file.MyFileConst;

public class MyStrUtils {
	
	
	public static int getBitesLength(String str) {
		int ret = 0;

		if (isNotEmpty(str)) {
			try {
				ret = str.getBytes(MyFileConst.ENCODE_SHIFT_JIS).length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof String) {
			return  obj.toString().length() == 0;
		} else if (obj instanceof List) {
			return ((List)obj).size()==0;
		} else if (obj instanceof Map) {
			return ((Map)obj).size()==0;
		} else if (obj instanceof Set) {
			return ((Set)obj).size()==0;
		} else if (obj instanceof Object[]) {
			return ((Object[])obj).length==0;
		}
		return false;
	}
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

	public static boolean isEqual(Object oldObj,Object newObj) {
		boolean retVal = false;
		if (oldObj==null ||newObj==null) {
			return retVal;
		}
		if (oldObj instanceof String && newObj instanceof String) {
			if (String.valueOf(oldObj).equals(newObj)) {
				retVal = true;
			}
		}
		return retVal;
	}

	public static boolean isNotEqual(Object oldObj,Object newObj) {
		return !isEqual(oldObj,newObj);
	}
	
	/**
	 * @param str
	 * @param strA
	 * @param strB
	 * @return String
	 */
	public static String fromAtoBByTrim(String str, String strA, String strB) {
		String ret = "";

		if (MyStrUtils.isNotEmpty(str)) {
			ret = fromAtoB(str, strA, strB);
			ret = lrTrimSpace(ret);
		}

		return ret;

	}
	public static String escapeNull(String str) {
		if (MyStrUtils.isEmpty(str)) {
			return "";
		} else {
			return str;
		}
	}
	/**
	 * @param ret
	 * @return String
	 */

	public static String lrTrimSpace(String str) {

		if (isEmpty(str)) {
			return "";
		}

		str = str.trim();
		while (str.startsWith(" ")
				|| str.startsWith(MyConst.Z_SIGN_SPACE_1)) {
			str = str.substring(1, str.length());
		}
		while (str.endsWith(" ")
				|| str.endsWith(MyConst.Z_SIGN_SPACE_1)) {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	/**
	 * @param str
	 * @param strA
	 * @param strB
	 * @return String
	 */
	public static String fromAtoB(String str, String strA, String strB) {

		if (null == strA) {
			strA = "";
		}
		if (null == strB) {
			strB = "";
		}
		String temp = "";
		int n = 0;
		if ("".equals(strA)) {
			if ("".equals(strB)) {
				return str;
			}
			if (str.contains(strB)) {
				return str.substring(0, str.indexOf(strB));
			}
			return str;
		}

		if ("".equals(strB)) {
			if (!"".equals(strA)) {
				if (str.contains(strA)) {
					n = str.indexOf(strA) + strA.length();
					if (n < str.length()) {
						return str.substring(n);
					} else if (n == str.length()) {
						return "";
					}
					return str;
				}
				return str;
			}
		}

		if (str.contains(strA)) {
			n = str.indexOf(strA) + strA.length();
			if (n < str.length()) {
				temp = str.substring(n);
			}

			if (temp.contains(strB)) {
				return temp.substring(0, temp.indexOf(strB));
			}
			return temp;
		} else {
			if (str.contains(strB)) {
				return str.substring(0, str.indexOf(strB));
			}
			return str;
		}
	}

	public static int getNumByte(long num) {
		int cnt = 0;
		if (num == 0) {
			return 1;
		}
		while (num != 0) {
			num = num / 10;
			cnt++;
		}
		return cnt;
	}

	public static String trimLeftChar(String retVal, String trimCh) {
		if (isEmpty(retVal)) {
			return "";
		}
		while (retVal.startsWith(trimCh)) {
			retVal = retVal.substring(1);
		}
		return retVal;
	}
	public static String getNumberByTrimDot0(String str) {
		if (MyStrUtils.isNotEmpty(str)) {
			if (str.matches(MyConst.NUMBER_INTEGER)) {
				str = String.valueOf(getIntVal(str));
			}
		}
		return str;
	}
	public static int getIntVal(String cellContents) {

		return (int) getLongVal(cellContents);
	}
	public static long getLongVal(String cellContents) {
		return (long) Double.parseDouble(cellContents);
	}

	public static String getXXX(String fileNmXXX, String targetX) {
		
		String retStr = getXXX(fileNmXXX,targetX,true);
		if (retStr.length() == 0) {
			retStr = getXXX(fileNmXXX,targetX,false);
		}
		return retStr;
	}
	
	public static String getXXX(String fileNmXXX, String targetX, boolean isUpper) {

		targetX = isUpper ? targetX.toUpperCase():targetX.toLowerCase();
		String retStr = "";
		String key = targetX;

		while (fileNmXXX.contains(key)) {
			key = key + targetX;
			retStr = retStr + targetX;
		}
		
		return retStr;
	}

	public static String getXXX(String filePattern, Set<String> repSet) throws Throwable {
		
		String retStr = "";
		for (String key : repSet) {
			retStr = getXXX(filePattern,key);
			if (MyStrUtils.isNotEmpty(retStr)) {
				return retStr;
			}
		}
		return retStr;
	}
	

	public static String getStrByXXXUpper(String str, Set<String> codeSet) {
		
		for (String code : codeSet) {
			str=getStrByXXXUpper(str,code);
		}
		return str;
		
	}
	public static String getStrByXXXUpper(String str, Map<String,String> codeMap) {
		
		for (String code : codeMap.keySet()) {
			str=getStrByXXXUpper(str,code);
		}
		return str;
		
	}
	
	public static String getStrByXXXUpperReg(String str, Map<String,String> codeMap) {
		
		for (Entry<String,String> entry : codeMap.entrySet()) {
			str=getStrByXXXUpper(str,entry.getKey());
			str = str.replaceAll(entry.getKey(), entry.getValue());
		}
		return str;
		
	}
	
	public static String getStrByXXXUpper(String str, String code) {
		
		String retStr = str;
		
		String strUpper = str.toUpperCase();
		String codeUpper = code.toUpperCase();
		if (strUpper.contains(codeUpper)) {
			StringBuffer retSb = new StringBuffer();
			String endStr="";
			int posStart = 0;
			
			while (strUpper.contains(codeUpper)) {
				int posXXXStart = strUpper.indexOf(codeUpper);
				int posXXXEnd = posXXXStart + codeUpper.length();
				retSb.append(str.substring(posStart, posStart+posXXXStart));
				retSb.append(codeUpper);
				posStart=posXXXEnd;
				strUpper=strUpper.substring(posXXXEnd);
				endStr = str.substring(retSb.toString().length());
			}
			retSb.append(endStr);
			retStr = retSb.toString();
		}

		return retStr;
	}


	public static String getRegexStrByRegMap(String foldPattern, Map<String, String> repFolderMap) {
		String retStr = foldPattern;
		
		for (Entry<String, String> entry : repFolderMap.entrySet()) {
			retStr = retStr.replaceAll(entry.getKey(), entry.getValue());
		}

		return retStr;
	}
	public static String funReplace(String rStr, String rFix, String rRep) {
		if (isEmpty(rStr)) {
			return "";
		}
		int l = 0;
		String gRtnStr = rStr;
		do {
			l = rStr.indexOf(rFix, l);
			if (l == -1)
				break;
			gRtnStr = rStr.substring(0, l) + rRep
					+ rStr.substring(l + rFix.length());
			l += rRep.length();
			rStr = gRtnStr;
		} while (true);
		return gRtnStr.substring(0, gRtnStr.length());
	}
	public static boolean isLRContaisStr(String str, Set<String> strSet,boolean isStart) {
		
		boolean ret = false;
		
		if (isStart) {
			for (String key : strSet) {
				if (str.startsWith(key)) {
					ret = true;
					break;
				}
			}
		} else {
			for (String key : strSet) {
				if (str.endsWith(key)) {
					ret = true;
					break;
				}
			}
		}
		return ret;
		
	}
	public static String lrTrimStartEndBySet(String str, Set<String> strSet,boolean isStart) {

		if (MyStrUtils.isEmpty(str)) {
			return "";
		} else if (MyStrUtils.isEmpty(strSet)) {
			return str;
		}

		if (isStart) {
			
			while (isLRContaisStr(str,strSet,isStart)) {
				for (String key : strSet) {
					if (str.contains(key)) {
						str = str.substring(key.length());
					}
				}
			}

		} else {
			while (isLRContaisStr(str,strSet,isStart)) {
				for (String key : strSet) {
					if (str.contains(key)) {
						str = str.substring(0,str.lastIndexOf(key));
					}
				}
			}
		}

		return str;
	}
	public static String rightFillChar(String str, String c, int length) {
		while (length > str.length()) {
			str += c;
		}
		return str;
	}
	public static int getCntForSameStr(String key, String str) {
		
		int retNum = 0;
		while (key.contains(str)) {
			key = key.substring(key.indexOf(str)+1);
			retNum++;
		}
		
		return retNum;
	}
	public static void main(String[] args) {
		System.out.println(getCntForSameStr("aayyyymmddbbyyyymmddccyyyymma", "mm"));
	}

	public static boolean isHasReg(String foldPattern, Map<String, String> regFolderMap) {
		boolean ret = false;
		for (String str : regFolderMap.keySet()) {
			if (foldPattern.toUpperCase().contains(str)) {
				ret = true;
			}
		}
		return ret;
	}
	
	public static String trimRChar(String str,String trimStr) {
		while(str.endsWith(trimStr)) {
			str = str.substring(0,str.length()-trimStr.length());
		}
		return str;
	}
}
