package com.baidu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		 
		
		// java.lang包以外的类都需要明确import
		Integer oInt = Integer.MAX_VALUE;
		Date date = null;
		
		// 数组在定义时，就已经把长度定死，后期不可修改。
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
		
		lst.add("aaa");
		for (String str : lst) {
			System.out.println(str);
		}
		
		
		
		
	}
}
