package com.test.prime;

import java.util.Scanner;

public class AlgorithmtoCheckPrimeNumber {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		
		boolean status=false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("It's a non prime number");
				status=true;
				break;
			}
		}
		
		
		if(!status)
		{
			System.out.println("It's a Prime number");
		}

	}

}
