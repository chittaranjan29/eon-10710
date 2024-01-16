package com.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();

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
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			if(itr.next() == 44)
			{
				list.remove(6);
			}
		}
		System.out.println("After remove");
		itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
