package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionTypes {

	public static void main(String[] args) {
	
		
		
		System.out.println("Enter any number:");
		try (   BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				FileReader fileReader=new FileReader("test.txt");
				Scanner scan=new Scanner(System.in);
				){
			
			int n=Integer.parseInt(bufferedReader.readLine());//checked exception
			System.out.println(n/0);//unchecked exception
			
		} 
		catch (NumberFormatException | NullPointerException e) { //checked exception
			
			System.out.println(e.getMessage());
		} 
		catch (IOException e) { //checked exception
	
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) { //checked exception
			
			System.out.println(e.getMessage());
		}
		/*
		 * finally { try { bufferedReader.close(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } }
		 */
	}

}
