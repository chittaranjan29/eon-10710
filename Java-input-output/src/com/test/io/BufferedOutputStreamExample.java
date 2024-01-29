package com.test.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		try 
		{
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Chittaranjan\\Desktop\\test.txt");
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			String st="Hello World";
			byte ar[]=st.getBytes();
			
			bufferedOutputStream.write(ar);
		
			
			bufferedOutputStream.close();
			fileOutputStream.close();
			System.out.println("Write operation completed!!");
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
