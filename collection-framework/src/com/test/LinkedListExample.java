package com.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		list.add(111);
		
		System.out.println(list);
		System.out.println(list.contains(177));
		System.out.println(list.get(5));
		System.out.println(list.indexOf(99));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.remove(1));
		list.remove(new Integer(55));
		System.out.println(list);
		
		System.out.println(list.removeAll(Arrays.asList(11,22,33)));
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.set(3, 222));
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list.reversed());
		System.out.println(list);
		System.out.println(list.containsAll(Arrays.asList(22,33)));
		List<Integer> sublist= list.subList(1, 3);
		
		System.out.println(sublist);
		list.replaceAll(x -> x*2);
		System.out.println(list);

		System.out.println(list);
	}

}
