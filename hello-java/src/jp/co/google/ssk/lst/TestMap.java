package jp.co.google.ssk.lst;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import jp.co.google.ssk.clz.MyUser;

public class TestMap {

	public static void main(String[] args) {
		
		System.out.println("无序hashMap ------");
		testHashMap();
		
		System.out.println("有序LinkedHashMap ------");
		testLinkedHashMap();

		System.out.println("从小到大有排序的TreeMap ------");
		testTreeMap();
	
	}
//
	private static void testTreeMap() {
		// TreeMap  从小到大有排序

		Map<String,MyUser> map = new TreeMap<String,MyUser>();
		map.put("no02", new MyUser("l4","def"));
		map.put("no01", new MyUser("z3","abc"));
		map.put("no03", new MyUser("w5","ghi"));
		map.put("no02", new MyUser("z6","jkl"));
		
		for(Entry<String,MyUser> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	
	}
	private static void testLinkedHashMap() {
		Map<String,MyUser> map = new LinkedHashMap<String,MyUser>();
		map.put("no02", new MyUser("l4","def"));
		map.put("no01", new MyUser("z3","abc"));
		map.put("no03", new MyUser("w5","ghi"));
		map.put("no02", new MyUser("z6","jkl"));
		
		for(Entry<String,MyUser> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
	private static void testHashMap() {
		// HashMap 无序
		// Map<String,MyUser>  逗号左边为KEY键， 右边为VALUE值     键值对
		Map<String,MyUser> map = new HashMap<String,MyUser>();
		map.put("no02", new MyUser("l4","def"));
		map.put("no01", new MyUser("z3","abc"));
		map.put("no03", new MyUser("w5","ghi"));
		map.put("no02", new MyUser("z6","jkl"));
		
		for(Entry<String,MyUser> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
}
