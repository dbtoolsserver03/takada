package com.oralce.study.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		
		// 长度固定
		int[] aArr = {1,2,3};
		
		// Set 如果有重复的，会覆盖
		// LinkedHashMap<k,v> 以put的顺序 进行排序
		// 长度灵活
		Map<String,String> intMap = new LinkedHashMap<String,String>();
		intMap.put("aaa","111");
		intMap.put("bbb","222");
		intMap.put("fff","666");
		intMap.put("eee","555");
		intMap.put("ddd","114441");
		intMap.put("aaa","111111111");
		intMap.put("ccc","333");
		
		System.out.println(intMap.size());
		for ( Entry<String,String> entry : intMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

}
