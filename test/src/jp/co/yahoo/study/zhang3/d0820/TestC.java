package jp.co.yahoo.study.zhang3.d0820;

import jp.co.yahoo.study.zhang3.TestA;

public class TestC {

	public static void main(String[] args) {
		
		// 调用public公开方法
		TestA.funSum();
		TestA.funSum(2,1);
		TestA.main(null);
		
		
		// 调用默认方法
		//TestA.funMinus(0, 0);
		
		// 私有方法不可调用
		//TestA.funDiv();
	}
}
