package com.test.string;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer  st=new StringBuffer("Welcome to Java");
		
		System.out.println(st.indexOf("to"));
		System.out.println(st.capacity());
		System.out.println(st.length());
		System.out.println(st.reverse());
		System.out.println(st.charAt(0));
		System.out.println(st.substring(7));
		System.out.println(st.replace(6, 7, "ab"));
		System.out.println(st.append(" Programming"));
		System.out.println(st.delete(4, 6));
		System.out.println(st.deleteCharAt(0));

	}

}
