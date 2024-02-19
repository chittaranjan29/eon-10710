package com.test.junit;

import java.util.Arrays;
import java.util.List;

public class AppleCalculator {

	List<String> apples= Arrays.asList("McIntosh","Fuji","Gala","JonaGold","GrannySmith","PinkLady");
	
	public boolean isApple(String appleName)
	{
		return apples.contains(appleName);
	}
	
	
}
