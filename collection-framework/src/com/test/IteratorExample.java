package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class IteratorExample {

	public static void main(String[] args) {
    TreeMap<String ,Integer> treeMap=new TreeMap<String, Integer>();
		
		treeMap.put("Robin", 378977373);		
		treeMap.put("Kunal", 836773736);
		treeMap.put("Kiran", 956388399);
		treeMap.put("Anil", 856388388);
		treeMap.put("Shalini", 799399393);
		
		
		Iterator<Entry<String, Integer>> itr=treeMap.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> entry=itr.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		
        PriorityQueue<Double> priorityQueue=new PriorityQueue<Double>() ;
		
		priorityQueue.add(11.35);
		priorityQueue.add(17.25);
		priorityQueue.add(37.11);
		priorityQueue.add(8.99);
		priorityQueue.add(18.35);
		priorityQueue.add(12.35);
		
		Iterator<Double> iterator=priorityQueue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
