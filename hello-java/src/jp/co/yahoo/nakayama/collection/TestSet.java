package jp.co.yahoo.nakayama.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {

		testHashSet();
//		testLinkedHashSet();
//		testTreeSet();
		
	}

	private static void testTreeSet() {
		// 内容の昇順で変数に保存する
		Set<String> set = new TreeSet<>();

		System.out.println("--------- TreeSet begin");
		set.add("hello");
		set.add("world");
		set.add("good");
		set.add("morining");

		set.add("good");

		for (String num : set) {
			System.out.println(num);
		}
		System.out.println("--------- TreeSet end");
	}
	
	private static void testLinkedHashSet() {
		// add の順位で変数に保存する
		Set<String> set = new LinkedHashSet<>();

		System.out.println("--------- LinkedHashSet begin");
		set.add("hello");
		set.add("world");
		set.add("good");
		set.add("morining");

		set.add("good");

		for (String num : set) {
			System.out.println(num);
		}
		System.out.println("--------- LinkedHashSet end");
	}

	private static void testHashSet() {
		//散乱
		Set<String> set = new HashSet<>();

		System.out.println("--------- HashSet begin");
		set.add("hello");
		set.add("world");
		set.add("good");
		set.add("morining");

		set.add("good");

		for (String num : set) {
			System.out.println(num);
		}
		
		System.out.println("--------- HashSet end");
	}

}
