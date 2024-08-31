package jp.co.yahoo.nakayama.cls.keisho.test;

import jp.co.yahoo.nakayama.cls.keisho.People;

public class TestCls {

	public static void main(String[] args) {
		
		//boolean isSea, int sex, int legNum, String dna
		
		People p = new People(false,1,2,"abc");
		System.out.println(p.isSea);
		System.out.println(p.getSex());
		System.out.println(p.getLegNum());
		System.out.println(p.getDna());

	}

}
