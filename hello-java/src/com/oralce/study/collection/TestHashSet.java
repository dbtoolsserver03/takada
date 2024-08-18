package com.oralce.study.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		// 长度固定
		int[] aArr = {1,2,3};
		
		// Set 如果有重复的，会覆盖
		// HashSet 乱序
		// 长度灵活
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(1);
		intSet.add(3);
		intSet.add(12);
		intSet.add(11);
		intSet.add(99);
		intSet.add(88);
		intSet.add(2);
		intSet.add(2);
		intSet.add(0);
		intSet.add(5);
		intSet.add(8);
//		System.out.println(intList.contains(3));
		for (Integer n : intSet) {
			System.out.println(n);
		}
		
	}

}
