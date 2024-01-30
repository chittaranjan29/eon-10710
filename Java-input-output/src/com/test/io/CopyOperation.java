package com.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyOperation {

	public static void main(String[] args) {
		
		//demo1.txt -> demo.txt
		try
		{
		 FileInputStream fileInputStream=new FileInputStream("demo1.txt");
		 FileOutputStream fileOutputStream=new FileOutputStream("demo.txt");
		 
		 int value;
		 
		 while((value=fileInputStream.read())!=-1)
		 {
			 fileOutputStream.write(value);
		 }
		 
		 System.out.println("Copy operation completed");
		 fileInputStream.close();
		 fileOutputStream.close();
		}
		catch(Exception e)
		{
		 System.out.println(e.getMessage());
		}
		
		

	}

}
