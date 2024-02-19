package com.test.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class FactorialTest {
	
	Factorial factorial;
	public FactorialTest()
	{
	  factorial=new Factorial();	
	}
	
	
	@Test
	public void calculateFactorial_testcase1()
	{
		long actualOutput=factorial.calculateFactorial(5);
		long exepectedOutput=120;
		assertEquals(exepectedOutput, actualOutput);		
	}
	
	
	@Test
	public void calculateFactorial_testcase2()
	{
		long actualOutput=factorial.calculateFactorial(0);
		long exepectedOutput=1;
		assertEquals(exepectedOutput, actualOutput);		
	}
	
	@Test
	public void calculateFactorial_testcase3()
	{
		long actualOutput=factorial.calculateFactorial(-7);
		long exepectedOutput=-1;
		assertEquals(exepectedOutput, actualOutput);		
	}
}
