package com.bai.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMap {


	public static void main(String[] args) {
		// 所有的set都具有去重复功能 
		
		System.out.println("--------testHashMap--------");
		testHashMap();
		
		System.out.println("--------testLinkedHashMap--------");
		testLinkedHashMap();

		System.out.println("--------testTreeMap--------");
		// 有排序功能的Map,按照KEY升序
		testTreeMap();
		
	}

	private static void testTreeMap() {
		
		Map<String,String> map = new TreeMap<String,String>();
		map.put("aaa", "111");
		map.put("bbbb", "22");
		map.put("ccc", "33333");
		map.put("aaa", "44444");
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

	private static void testLinkedHashMap() {
		
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("aaa", "111");
		map.put("bbbb", "22");
		map.put("ccc", "33333");
		
		map.put("aaa", "44444");
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

	private static void testHashMap() {
		
		Map<String,String> map = new HashMap<String,String>();
		
//		set.add("aaa");
//		set.add("bbbb");
//		set.add("ccc");
		map.put("aaa", "111");
		map.put("bbbb", "22");
		map.put("ccc", "33333");
		
		map.put("aaa", "44444");
//		for(String key : map.keySet()) {
//			System.out.println(key + ":" + map.get(key));
//		}
		
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

}
