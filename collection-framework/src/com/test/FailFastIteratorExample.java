package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample {

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
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			if(itr.next() == 44)
			{
				list.remove(6);
			}
		}
		
	}

}
