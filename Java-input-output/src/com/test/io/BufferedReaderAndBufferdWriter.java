package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndBufferdWriter {

	public static void main(String[] args) {
		
		try 
		{
			FileReader fileReader=new FileReader("demo.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			int data;
			
			while((data=bufferedReader.read())!=-1)
			{
				System.out.print((char)data);
			}
			
			bufferedReader.close();
			fileReader.close();
			
			FileWriter fileWriter=new FileWriter("demo1.txt");
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
			bufferedWriter.write("hello world");
			bufferedWriter.close();
			fileWriter.close();
			
			System.out.println("read and write completed");
			
		} catch (FileNotFoundException e) {


			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
