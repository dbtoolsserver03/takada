package jp.co.google.ssk.lst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		System.out.println("无序hashset ------");
		testHashSet();
		
		System.out.println("有序LinkedHashSet ------");
		testLinkedHashSet();
		
		System.out.println("从小到大有排序的TreeSet ------");
		testTreeSet();
		
		System.out.println("testListAndSet()");
		
		testListAndSet();
		
	}

	private static void testTreeSet() {
		// TreeSet  从小到大有排序
		Set<String> set = new TreeSet<String>();
		
		set.add("hello");
		set.add("world");
		set.add("ni");
		set.add("hao");
		
		for (String str : set) {
			System.out.println(str);
		}
	}
	private static void testLinkedHashSet() {
		// LinkedHashSet 有序 根据add的顺序 
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("hello");
		set.add("world");
		set.add("ni");
		set.add("hao");
		
		for (String str : set) {
			System.out.println(str);
		}
	}
	
	private static void testHashSet() {
		// HashSet 无序
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add("world");
		set.add("ni");
		set.add("hao");
		
		for (String str : set) {
			System.out.println(str);
		}
	}
	
	
	private static void testListAndSet() {

		
		List<String> lst = new ArrayList<String>();
		

		lst.add("hello");
		lst.add("world");
		lst.add("ni");
		lst.add("hao");
		lst.add("ni");
		
		System.out.println("list : ");
		for (String str : lst) {
			System.out.println(str);
		}
		
		Set<String> set = new LinkedHashSet<String>();

		set.add("hello");
		set.add("world");
		set.add("ni");
		set.add("hao");
		set.add("ni");
		
		System.out.println("set : ");
		
		for (String str : set) {
			System.out.println(str);
		}

		// set和List区别
		// set 有三种实现类（无序，有序（按照add顺序），从小到大顺序的） 可以去重复数据
		// List 有序（按照add顺序） 不可以去重复数据
	}
}
