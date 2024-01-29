package com.test.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		
		try 
		{
			FileOutputStream fileOutputStream1=new FileOutputStream("C:\\Users\\Chittaranjan\\Desktop\\test1.txt");
			FileOutputStream fileOutputStream2=new FileOutputStream("C:\\Users\\Chittaranjan\\Desktop\\test2.txt");
			
			
			ByteArrayOutputStream arrayOutputStream=new ByteArrayOutputStream();
			String st="Hello World";
			byte ar[]=st.getBytes();
			
			arrayOutputStream.writeBytes(ar);
			
			arrayOutputStream.writeTo(fileOutputStream1);
			arrayOutputStream.writeTo(fileOutputStream2);
			
			
			arrayOutputStream.close();
			fileOutputStream1.close();
			fileOutputStream2.close();
			
			System.out.println("Copy operation completed!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
