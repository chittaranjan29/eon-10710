package com.test;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String ,Integer> treeMap=new TreeMap<String, Integer>();
		
		treeMap.put("Robin", 378977373);		
		treeMap.put("Kunal", 836773736);
		treeMap.put("Kiran", 956388399);
		treeMap.put("Anil", 856388388);
		treeMap.put("Shalini", 799399393);
		
		System.out.println(treeMap.ceilingKey("Kiran"));
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastKey());
		//treeMap.putFirst("Kunal", 5535353);
		//treeMap.putLast("Tarun", 37993893);
		
	}

}
