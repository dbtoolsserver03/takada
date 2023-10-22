package com.bai.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		
		
		// 数组在定义时，就已经把长度定死子，后期不可修改。
		int[] a = {1,2,3};
		for (int n : a) {
			System.out.println(n);
		}
		
		System.out.println("-----------------");
		// LIST 存储能力可扩展
		List<String> lst = new ArrayList<String>();
		lst.add("hello");
		lst.add("world");
		lst.add("ni");
		lst.add("hao");
		
		lst.remove(0);
		lst.remove("ni");
		
		List<String> lstTmp = Arrays.asList("aaa","bbbb");
		
		
		lst.addAll(lstTmp);
		
		lst.add(1, "xxxxxxxxxxxxxx");
		
		for (String str : lst) {
			System.out.println(str);
		}
		
		
		
		
	}
}
