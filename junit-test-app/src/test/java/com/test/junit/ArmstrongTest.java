package com.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class ArmstrongTest {
	
	@ParameterizedTest
	@ValueSource(longs = {123,6789,153,897,1634})
	public void testCase(Long num)
	{
		Armstrong armstrong=new Armstrong();
		assertTrue(armstrong.armstrongCheck(num));
	}

}
