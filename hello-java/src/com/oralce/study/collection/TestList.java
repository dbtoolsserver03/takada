package com.oralce.study.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		// 长度固定
		int[] aArr = {1,2,3};
		
		// 长度灵活
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(2);
		
//		System.out.println(intList.contains(3));
		
		for (Integer n : intList) {
			System.out.println(n);
		}
		
	}

}
