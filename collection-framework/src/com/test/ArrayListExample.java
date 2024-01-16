package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
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
		
		
		List<Double> list1=new ArrayList<Double>(20);
		list1.add(11.1);
		list1.add(22.2);
		list1.add(33.3);
		list1.add(44.4);
		list1.add(55.5);
		list1.add(66.6);
		list1.add(77.7);
		list1.add(88.8);
		list1.add(99.9);
		list1.add(111.10);
		
		System.out.println(list);
		System.out.println(list1);
		
		
		//Iterate over/loop over the arrayList
		
		//Standard for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//Advanced for loop
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		//foreach loop - Java 8
		list.forEach(
				x -> System.out.println(x)   //lambda expression
				);
		
		//using iterator interface
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		List<Integer> listIterator1=list.reversed();
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
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
		list.trimToSize();
		System.out.println(list);
		
		
		
		list.clear();
	}
	

}
