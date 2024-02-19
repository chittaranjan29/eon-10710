package com.test.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Set up: This phase put the test infrastructure in place.Junit provides class level setup
 * and method level setup.
 * 
 * Test execution:In this phase test execution and assertion happens.
 * The execution result will signify a success or failure.
 * 
 * 
 * Clean up: This phase is used to clean up the test infrastructure setup in the first 
 * phase.Just like setup,teardown also happens at class level and method level.  
 * 
 * 
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
public class TestLifeCycle {
	
	@BeforeAll
	public static void classLevelSetup()
	{
		System.out.println("Class level setup method");
	}
	
	@BeforeEach
	public  void methodLevelSetup()
	{
		System.out.println("Method level setup method");
	}
	

	@Test
	public void testCase1()
	{
	    System.out.println("Test case1 executed");
	   assertEquals("Hello World","Hello World");	
	}
	
	@Test
	public void testCase2()
	{
	    System.out.println("Test case2 executed");
	   assertEquals("Hello World","Hello World");	
	}
	
	@AfterEach
	public  void methodLevelCleanup()
	{
		System.out.println("Method level cleanup method");
	}
	
	@AfterAll
	public static void classLevelCleanup()
	{
		System.out.println("Class level cleanup method");
	}
	

}
