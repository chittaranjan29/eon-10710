package com.flow.control;

public class DoWhileExample {

	public static void main(String[] args) {
		
		//Exit controlled loop
		int i=11;
		do         //body gets executed atleast once
		{
			System.out.println(i);
			i=i+1;
		}
		while(i<=10); //11<=10

	}

}
