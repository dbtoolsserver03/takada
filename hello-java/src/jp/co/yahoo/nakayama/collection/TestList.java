package jp.co.yahoo.nakayama.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		// 配列、長さ固定
		int[] arr = {1,2,4,5};
		
		// リスト、長さ固定ではない
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(4);
		lst.add(5);
		lst.add(2);
		
		for (Integer num : lst) {
			System.out.println(num);
		}
		//lst.clear();
		System.out.println(lst.contains(1));
		
	}

}
