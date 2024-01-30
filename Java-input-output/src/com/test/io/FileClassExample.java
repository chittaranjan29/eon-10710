package com.test.io;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

	public static void main(String[] args) {
		
	try
	{
		File file=new File("demo.txt");
		File file1=new File("demo1.txt");
		
		if(file.createNewFile())
		{
			System.out.println("File is created!");
		}
		else
		{
			System.out.println("File already exist!");
		}
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.compareTo(file1));
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.renameTo(new File("sample.txt")));
		
		File file3=new File("C:/");
		String names[]=file3.list();
		for(String name:names)
		{
			System.out.println(name);
		}
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.length());
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
