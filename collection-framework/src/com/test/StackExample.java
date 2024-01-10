package com.test;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack<String> stack=new Stack<String>();
		
		stack.push("Java");
		stack.push("C");
		stack.push("C++");
		stack.push("Python");
		stack.push("C#");
		stack.push("Php");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		System.out.println(stack.add("Go"));
		System.out.println(stack.empty());
		System.out.println(stack.elementAt(0));
		System.out.println(stack.capacity());
		System.out.println(stack.contains("C#"));
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		System.out.println(stack.get(3));
		System.out.println(stack.set(2, "SQL"));
		System.out.println(stack.remove(2));
	}

}
