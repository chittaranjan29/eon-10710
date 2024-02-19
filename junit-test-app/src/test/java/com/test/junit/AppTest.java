package com.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class AppTest     
{
	
	
	@Disabled
	@Test
	public void testCase1()
	{
		assertEquals(10, 5+5);
	}
	
	
	//@Test
	@RepeatedTest(5)
	public void testCase2()
	{
		assertEquals(7, 5+2);
	}
	
	@Test
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 1000)
	public void testNull()
	{
		App app=new App();
		String st=null, st1="Hello";
		assertNull(st);
		assertNotNull(st1);
		assertNotEquals(st, st1);
		assertTimeout(Duration.ofSeconds(1), ()->{app.countBlanksInString("hello world");});
	}
	
	
	@Test
	@Disabled
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 1000)
	public void printNumbers()
	{
		for(int i=1;i<=1000000;i++)
		{
			System.out.println(i);
		}
	}
	
	
	
	
	@Test
	@DisplayName("Testing countBlank method with in between whitespaces")
	public void countBlanksInString_testcase_1() throws InterruptedException
	{
		App app=new App();
		int actualBlanksCount=app.countBlanksInString("Welcome to Junit tesing");
		int expectedBlanksCount=3;
		assertSame(expectedBlanksCount, actualBlanksCount);
	}
	
	@Test
	@DisplayName("Testing countBlank method with leading and trailing whitespaces")
	public void countBlanksInString_testcase_2() throws InterruptedException
	{
		App app=new App();
		int actualBlanksCount=app.countBlanksInString("  Welcome to Junit tesing   ");
		int expectedBlanksCount=8;
		assertSame(expectedBlanksCount, actualBlanksCount);
	}
	

}