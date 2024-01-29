package com.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
	
		try 
		{
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Chittaranjan\\Desktop\\test.txt");
			int value=fileInputStream.read();
			System.out.println((char)value);
			
			
			while((value=fileInputStream.read())!=-1)
			{
				System.out.print((char)value);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
