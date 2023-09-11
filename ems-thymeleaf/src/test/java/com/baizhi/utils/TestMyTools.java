package com.baizhi.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMyTools {

	@Test
	public void funTestSum() {
		
		int realSum = MyTools.sum(1, 2);
		assertEquals(3, realSum);
	}
}
