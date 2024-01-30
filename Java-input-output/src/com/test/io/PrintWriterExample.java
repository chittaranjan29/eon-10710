package com.test.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		
		try 
		{
			PrintWriter printWriter=new PrintWriter("sample.txt");
			printWriter.write(78);
			
			String st="Hello Java!";
			printWriter.write(st);
			printWriter.close();
	
			
			
			PrintWriter printWriter1=new PrintWriter(System.out);
			printWriter1.write("Bye Java");
			printWriter1.close();
		
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
