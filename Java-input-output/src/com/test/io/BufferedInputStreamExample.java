package com.test.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		
		try 
		{
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Chittaranjan\\Desktop\\test.txt");
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			
			int data;
			
			while((data=bufferedInputStream.read())!=-1)
			{
				System.out.println((char)data);
			}
			
			
			fileInputStream.close();
			bufferedInputStream.close();
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
