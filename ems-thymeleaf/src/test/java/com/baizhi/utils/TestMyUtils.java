package com.baizhi.utils;

import org.junit.jupiter.api.Test;

import cn.hutool.core.lang.Assert;

public class TestMyUtils {

	@Test
	void test() {
		
		int ret = MyUtils.getArea(2, 5);
		Assert.equals(ret, 10);
	}
}
