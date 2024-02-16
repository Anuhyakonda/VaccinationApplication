package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.t.Addition;

public class TestAddition {
	@Test
	public void testAdd()
	{
		Addition a=new Addition();
		int actualResult=a.add(10,20);
		int expectedResult=30;
		assertEquals(expectedResult,actualResult);
	}
	@Test
	public void testMul()
	{
		Addition a=new Addition();
		int actualResult=a.mul(100,2);
		int expectedResult=200;
		assertEquals(expectedResult,actualResult);
	}
	

}
