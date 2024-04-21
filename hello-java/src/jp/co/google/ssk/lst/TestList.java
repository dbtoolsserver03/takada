package jp.co.google.ssk.lst;

import java.util.ArrayList;
import java.util.List;

import jp.co.google.ssk.clz.MyUser;

public class TestList {

	public static void main(String[] args) {
		
		MyUser user1 = new MyUser("z3","123");
		MyUser user2 = new MyUser("l4","234");
		MyUser user3 = new MyUser("w5","456");
		
		// 数组一旦定义，数组长度就定死了，不灵活
		MyUser[] arr = {user1,user2,user3};
		
		System.out.println("arr ------------");
		arr[0] = null;
		
		for (MyUser myUser : arr) {
			System.out.println(myUser);

		}
		
		
		System.out.println("------------");
		
		List<MyUser> lst = new ArrayList<MyUser>();
		lst.add(user1);
		lst.add(user2);
		lst.add(user3);
		
		System.out.println("list ------------");

	
		for (MyUser myUser : lst) {
			System.out.println(myUser);
		}
		
		lst.remove(0);
		lst.add(new MyUser("w5","456"));
		
		System.out.println("list ------------");
		for (MyUser myUser : lst) {
			System.out.println(myUser);
		}
		
		
	}
}
