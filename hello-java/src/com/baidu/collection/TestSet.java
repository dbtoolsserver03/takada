package com.baidu.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		// 所有的set都具有去重复功能 
		
		System.out.println("--------testHashSet--------");
		testHashSet();
		
		System.out.println("--------testLinkedHashSet--------");
		// 和LIST效果一样，多了一个去重复的功能 
		// 按照追加时的顺序进行存储
		testLinkedHashSet();

		System.out.println("--------testTreeSet--------");
		
		// 有排序功能的set
		// 按照值的进行存储
		testTreeSet();
		
	}

	private static void testTreeSet() {
		// hashSet 乱序
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("bbbb");
		set.add("ccc");
		set.add("best");
		// 追加时，如果变量里有相同的值时，会把旧的覆盖（不是跳过）
		set.add("aaa");
		
		for(String str : set) {
			System.out.println(str);
		}
	}

	private static void testLinkedHashSet() {
		// hashSet 乱序
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("aaa");
		set.add("bbbb");
		set.add("ccc");
		set.add("best");
		// 追加时，如果变量里有相同的值时，会把旧的覆盖（不是跳过）
		set.add("aaa");
		
		for(String str : set) {
			System.out.println(str);
		}
	}

	private static void testHashSet() {
		// hashSet 乱序
		Set<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbbb");
		set.add("ccc");
		set.add("best");
		// 追加时，如果变量里有相同的值时，会把旧的覆盖（不是跳过）
		set.add("aaa");
		
		for(String str : set) {
			System.out.println(str);
		}
	}

}
