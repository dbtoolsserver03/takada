package jp.co.yahoo.nakayama.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		testHashMap();
		testLinkedHashMap();
		testTreeMap();
	}


	private static void testTreeMap() {

		// putの順位で保存する
		Map<String,String> map = new TreeMap<>();

		System.out.println("--------- TreeMap begin");
		
		map.put("hello", "h");
		map.put("world", "w");
		map.put("good", "g");
		map.put("morining", "m");
		
		map.put("good", "gg");
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("--------- TreeMap end");
	
	}
	
	private static void testLinkedHashMap() {

		// putの順位で保存する
		Map<String,String> map = new LinkedHashMap<>();

		System.out.println("--------- LinkedHashMap begin");
		
		map.put("hello", "h");
		map.put("world", "w");
		map.put("good", "g");
		map.put("morining", "m");
		
		map.put("good", "gg");
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("--------- LinkedHashMap end");
	
	}

	private static void testHashMap() {

		//散乱
		Map<String,String> map = new HashMap<>();

		System.out.println("--------- HashMap begin");
		
		map.put("hello", "h");
		map.put("world", "w");
		map.put("good", "g");
		map.put("morining", "m");
		
		map.put("good", "gg");
		
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("--------- HashMap end");
	
	}

}
