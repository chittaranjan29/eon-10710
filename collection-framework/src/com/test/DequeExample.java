package com.test;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DequeExample {

	public static void main(String[] args) {

		ArrayDeque<String> arrayDeque=new ArrayDeque<String>();
		
		
		

		arrayDeque.add("India");
		arrayDeque.add("Srilanka");
		arrayDeque.add("Pakistan");
		arrayDeque.add("China");
		arrayDeque.add("Afganistan");
		arrayDeque.add("USA");
		arrayDeque.add("UK");
		arrayDeque.add("India");
		//arrayDeque.add(null);
		
		System.out.println(arrayDeque);
		arrayDeque.addAll(Arrays.asList("UAE","South Korea"));
		System.out.println(arrayDeque);
		arrayDeque.addFirst("Nepal");
		arrayDeque.addLast("Bhutan");
		System.out.println(arrayDeque);
		
		System.out.println(arrayDeque.element());
		System.out.println(arrayDeque.getFirst());

		System.out.println(arrayDeque.getLast());
		System.out.println(arrayDeque.peekFirst());
		
		System.out.println(arrayDeque.peekLast());
		
		
	}

}
