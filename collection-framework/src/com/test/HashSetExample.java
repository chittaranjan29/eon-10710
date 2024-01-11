package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		Set<String> set1=new HashSet<String>();
		
		
		set.add("India");
		set.add("Srilanka");
		set.add("Pakistan");
		set.add("China");
		set.add("Afganistan");
		set.add("USA");
		set.add("UK");
		set.add("India");
		set.add(null);
		
		System.out.println(set);		
		Iterator<String> iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		System.out.println(set.size());
		System.out.println(set.contains("India"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove(0));
		System.out.println(set);
		set.addAll(Arrays.asList("UAE","South Korea"));

		System.out.println(set.addAll(set1));
		System.out.println(set);
		
		HashSet<String> copy=(HashSet<String>) set.clone();
		System.out.println(copy);
		
		copy.clear();
		System.out.println(copy);
	}

}
