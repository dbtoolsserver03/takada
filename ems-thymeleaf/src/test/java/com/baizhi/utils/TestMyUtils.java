package com.baizhi.utils;

import org.junit.jupiter.api.Test;

import cn.hutool.core.lang.Assert;

public class TestMyUtils {

	@Test
	void test() {
		MyUtils obj = new MyUtils();	
		int ret = MyUtils.getNumber("*",2, 5);
		Assert.equals(ret, 10);
		 ret = MyUtils.getNumber("+",2, 5);
		Assert.equals(ret, 7);
	}
}
