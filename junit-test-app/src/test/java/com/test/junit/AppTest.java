package com.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest     
{
	@Test
	public void testCase1()
	{
		assertEquals(10, 5+5);
	}
	
	
	@Test
	public void testCase2()
	{
		assertEquals(7, 5+5);
	}

}