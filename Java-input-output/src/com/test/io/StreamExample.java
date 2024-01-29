package com.test.io;

import java.io.IOException;

public class StreamExample {

	public static void main(String[] args) throws IOException {
		
		int a=System.in.read(); //returns ASCII of the given character

		System.out.print((char)a);

		System.err.print("Error message");

	}

}
