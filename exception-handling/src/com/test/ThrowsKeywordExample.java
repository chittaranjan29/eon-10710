package com.test;

import java.io.IOException;

class VoterCheck
{
	private int age;
	
	public VoterCheck()
	{
		
	}
	public VoterCheck(int age)
	{
		this.age=age;
	}
	
	void checkEligibility() throws IOException
	{
		if(this.age>=18)
		{
			System.out.println("Eligible for casting vote");
		}
		else
		{
			throw new IOException("Not-eligible for casting vote");
		}
	}
}

public class ThrowsKeywordExample {

	public static void main(String[] args) {
		VoterCheck voter1=new VoterCheck(25);
		VoterCheck voter2=new VoterCheck(15);
		
		try
		{
			voter1.checkEligibility();
			voter2.checkEligibility();
		}
		catch (Exception e) 
		{
		 System.out.println(e.getMessage());
		}
	}

}
