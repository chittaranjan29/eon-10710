package com.test.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		
		byte arr[]= {65, 66, 67, 68, 69};
		
		ByteArrayInputStream arrayInputStream=new ByteArrayInputStream(arr);
		int value;
		
		while((value=arrayInputStream.read())!=-1) 
		{
			System.out.println((char)value);
		}

	}

}
