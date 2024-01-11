package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<Integer>();
		
		hashSet.add(11);
		hashSet.add(22);
		hashSet.add(33);
		hashSet.add(44);
		hashSet.add(55);
		hashSet.add(66);
		hashSet.add(77);
		hashSet.add(88);
		hashSet.add(8);
		hashSet.add(2);	
		hashSet.add(38);
		
		
		System.out.println(hashSet);
		
		hashSet.addFirst(79);
		hashSet.addLast(63);
		System.out.println(hashSet.contains(88));
		System.out.println(hashSet.removeFirst());
		System.out.println(hashSet.removeLast());
		
		System.out.println(hashSet);
	}

}
