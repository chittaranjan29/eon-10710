package com.test.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String st=scanner.nextLine();
		
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		
		System.out.println(rev);

	}

}
