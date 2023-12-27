package com.test.string;

public class StringDeclartion {

	public static void main(String[] args) {
		
		String st="Hello World";//created in the constant pool region of the heap memory - 3872323
		
		System.out.println(st);
		System.out.println(System.identityHashCode(st));
		
		st="Hi everyone!!";//contant pool - 3333233
		
		System.out.println(st);
		System.out.println(System.identityHashCode(st));
		
		String st2="HI EVERYONE!!";
		
		String st1=new String("   Welcome to String Programming    ");//object created in heap area 
		
		System.out.println(st1.length());
		System.out.println(st1.charAt(4));
		System.out.println(st1.substring(8));
		System.out.println(st1.substring(8, 10));
		System.out.println(st1.contains("Programming"));
		System.out.println(st1.contains("Java"));
		System.out.println(st.concat(st1));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.endsWith("everyone!!"));
		System.out.println(st.endsWith("!!"));
		System.out.println(st.indexOf('H'));
		System.out.println(st.indexOf("everyone"));
		System.out.println(st.equals(st1));
		System.out.println(st.equals("Hi everyone!!"));
		System.out.println(st.equalsIgnoreCase(st2));
		
		String st3="  ";
		//isBlank() - true if the string is empty or contains only white space codepoints,otherwise false
		System.out.println(st3.isBlank());
		
		//isEmpty() - true if length() is 0, otherwise false
		System.out.println(st3.isEmpty());
		
		//replace - replace all occurrence
		//replaceAll - replace all the occurrences
		
		System.out.println(st2.replace('H', 'h'));
		System.out.println(st2.replace("HI", "hi"));
		
		System.out.println(st1.replace("e", "E"));
		
		System.out.println(st1.replaceAll(" ", "!"));
		
		//split - it spits a string based on a regular expression to an array of String
		String ar[]=st1.split(" ");
		
		for(String s:ar)//Advanced for loop
		{
			System.out.print(s+", ");
		}
		
		System.out.println(st1.toString());
		System.out.println(st1.trim());
		
		String test=String.join(st,st1,st2); 
		System.out.println(test);
		
		//valueOf
		
		int a=256;
		double b=3663.36;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		
		
	}

}
