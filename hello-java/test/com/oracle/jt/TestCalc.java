package com.oracle.jt;

import org.junit.Assert;
import org.junit.Test;


/*
 * 
 * 要求：
 * 用于测试的类和测试对象的包名要一致
 * 
 * 目标：
 * 代码覆盖率要达到是100%，达不到要写理由
 * 
 */
public class TestCalc {

	@Test
	public void testCalc_001() {
		
		int actual = Calc.funCalc(10, 5, '+');
		
		int expected = 15;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalc_002() {
		
		int actual = Calc.funCalc(10, 5, '-');
		
		int expected = 5;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalc_003() {
		
		int actual = Calc.funCalc(10, 5, '*');
		
		int expected = 50;
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testCalc_004() {
		
		int actual = Calc.funCalc(10, 5, '/');
		
		int expected = 2;
		
		Assert.assertEquals(expected, actual);
	}
}
