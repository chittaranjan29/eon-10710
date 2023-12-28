package com.test.string;

import java.util.Scanner;

public class CharacterCounts {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String st=scanner.nextLine();
		
		int alphabets=0, digits=0, spaces=0, special=0, vowels=0, consonants=0;
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				alphabets+=1;
				
				if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U')
				{
					vowels+=1;
				}
				else
				{
					consonants+=1;
				}
			}
			else if(ch>='0' && ch<='9')
			{
				digits+=1;
			}
			else if(ch==' ')
			{
				spaces+=1;
			}
			else
			{
				special+=1;
			}
			
		}
		
		System.out.println("Alphabets = "+alphabets);
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		System.out.println("Digits = "+digits);
		System.out.println("Spaces = "+ spaces);
		System.out.println("Special Characters = "+special);
	}

}
