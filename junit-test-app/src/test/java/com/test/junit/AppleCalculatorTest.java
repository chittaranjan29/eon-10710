package com.test.junit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
public class AppleCalculatorTest {

	@ParameterizedTest
	@ValueSource(strings= {"McIntosh","Fuji","Gala","Orange","Amber"})
	void isAppleTest(String appleName)
	{
		AppleCalculator appleCalculator=new AppleCalculator();
		assertTrue(appleCalculator.isApple(appleName));
	}
	
	boolean status=true;
	String apple="McIntosh";
	String apple1=null;
	@Test
	void testCase()
	{
		assertAll(
				()->assertTrue(status),
				()->assertEquals("McIntosh",apple),
				()->assertNotNull(apple1)
				);
	}
}
