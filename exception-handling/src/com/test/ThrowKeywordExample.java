package com.test;
class CheckVoter
{
	private int age;
	
	public CheckVoter()
	{
		
	}
	public CheckVoter(int age)
	{
		this.age=age;
	}
	
	void checkEligibility() throws InvalidAgeException
	{
		if(this.age>=18)
		{
			System.out.println("Eligible for casting vote");
		}
		else
		{
			//throw new RuntimeException("Not-eligible for casting vote");
			throw new InvalidAgeException("Not-eligible for casting vote");
		}
	}
}


public class ThrowKeywordExample {

	public static void main(String[] args) {
		
		
		CheckVoter voter1=new CheckVoter(25);
		CheckVoter voter2=new CheckVoter(15);
		
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
