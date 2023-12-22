package com.flow.control;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		System.out.println("=======================");
		System.out.println(" 1 -> Sunday");
		System.out.println(" 2 -> Monday");
		System.out.println(" 3 -> Tuesday");
		System.out.println(" 4 -> Wednesday");
		System.out.println(" 5 -> Thursday");
		System.out.println(" 6 -> Friday");
		System.out.println(" 7 -> Saturday");
		System.out.println("===========================");
		System.out.print("\t Enter Your Choice:");
		choice=scanner.nextInt();
		System.out.println("===========================");
		
		
		
		switch(choice)//control variable - Fall through the execution
		{
		 case 1:System.out.println("Sunday");
		 		break;
		 case 2:System.out.println("Monday");
	 			break;
		 case 3:System.out.println("Tuesday");
	 			break;
		 case 4:System.out.println("Wednesday");
	 			break;
		 case 5:System.out.println("Thursday");
	 			break;
		 case 6:System.out.println("Saturday");
	 			break;
		 case 7:System.out.println("Sunday");
	 			break;	
		 case 8:
		 case 9:
		 case 10:System.out.println("No match found!!");
		 	     break;
		 case 11,12,13: System.out.println("No suitable match found!!");	
		 				break;
	 	 default:System.out.println("Wrong choice!!");		
		}
		
		System.out.println("===========================");

	}

}
