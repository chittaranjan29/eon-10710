package com.test;

public class InvalidAgeException extends Exception{

	public InvalidAgeException()
	{
		super();
	}
	
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
