package com.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		
		try 
		{
			FileOutputStream fileOutputStream=new FileOutputStream("demo.txt");
			PrintStream printStream=new PrintStream(fileOutputStream);
			
			printStream.write(67);//C
			printStream.write(89);//Y
			
			printStream.print("hi");
			printStream.print(false);
			
			printStream.close();
			System.out.println("completed");
		} 
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
