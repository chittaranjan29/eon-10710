package com.test;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		String st="Hello";
		
		if(st!=null)
		{
			System.out.println(st);
			System.out.println(st.length());
		}
		
		Optional<String> s1=Optional.of(st);//Returns an Optional describing the given non-nullvalue.
		
		Optional<String> s=Optional.ofNullable(st);//Returns an Optional describing the given value, ifnon-null, otherwise returns an empty Optional.
		
		Optional<String> s2=Optional.empty();// //If a value is present, returns true, otherwise false.
		
		System.out.println(s2.isEmpty()); //If a value is present, returns true, otherwise false.
		
		if(s.isPresent()) //If a value is present, returns true, otherwise false.
		{
			System.out.println(s);
			System.out.println(s.get());//If a value is present, returns the value, otherwise throws NoSuchElementException.
			System.out.println(s.get().length());
		}
		
		
		//orElse
		//Return the value if present otherwise returns another.
		String name=null;
		String n=Optional.ofNullable(name).orElse("Test Name");
		System.out.println(n);
		
		//orElseGet
		//Return the value if present otherwise invoke other and return the result of invocation
		 name=null;
		 n=Optional.ofNullable(name).orElseGet(()->"Kumar");
		 System.out.println(n);
		 
		 
		 //orElseThrow
		 //If a value is present, returns the value, otherwise throws NoSuchElementException.
		 name=null;
		 n=Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
		 System.out.println(n);
	}

}
