package com.test.junit;

import java.util.concurrent.TimeUnit;

public class App 
{
	
	public int countBlanksInString(String str) throws InterruptedException
	{
		int count=0,i;
		
		for(i=0;i<str.length();i++)
		{
			TimeUnit.SECONDS.sleep(1);
			if(str.charAt(i)==' ')
			{
				++count;
			}
		}
				
		return count;
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
