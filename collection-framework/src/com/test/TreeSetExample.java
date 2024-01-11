package com.test;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("India");
		set.add("Srilanka");
		set.add("Pakistan");
		set.add("China");
		set.add("Afganistan");
		set.add("USA");
		set.add("UK");
		set.add("India");
		//set.add(null);
		
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.addAll(Arrays.asList("Emgland", "UAE")));
		
		System.out.println(set);
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
	}

}
