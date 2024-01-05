package com.test;

public class RuntimeErrorExample {

	public static void main(String[] args) {
		
		int a=10, b=20, c=89;
		String st=null;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(b/a);
		
		try
		{
			System.out.println(st.length());//runtime error - NullPointerException
			System.out.println(a/0);//runtime error - ArithmaticException
		}
		catch(NullPointerException e)//Specific catch block
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e)//Specific catch block
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e) { //Generic catch block
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(b-a);
			System.out.println(a*b);
		}
	}

}
