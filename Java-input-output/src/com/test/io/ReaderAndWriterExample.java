package com.test.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriterExample {

	public static void main(String[] args) {
	
		try 
		{
			Reader reader=new FileReader("demo.txt");
			int data=reader.read();
			while(data!=-1)
			{
				System.out.println((char)data);
				data=reader.read();
			}
			
			reader.close();
			
			Writer writer=new FileWriter("demo.txt");
			String st="This is a text file";
			writer.write(st);
			writer.close();
			
			System.out.println("Read and write completed!!");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
