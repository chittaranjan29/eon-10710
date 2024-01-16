package com.test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String,String> hashMap=new HashMap<String, String>();
		

		hashMap.put("v", "virat");
		hashMap.put("a", "alex");
		hashMap.put("i", "ishika");
		hashMap.put("s", "sonu");
		hashMap.put("M", "Mrinalini");
		hashMap.put("j", "john");
		
		System.out.println(hashMap);
		//hashtable.clear();
			
				System.out.println(hashMap.containsKey(89));
				System.out.println(hashMap.containsValue("ishika"));
				System.out.println(hashMap.get("sonu"));
				System.out.println(hashMap.getOrDefault("ram", "unnammed"));
				System.out.println(hashMap.isEmpty());
				System.out.println(hashMap.remove(1));
				System.out.println(hashMap.remove(1,"alex"));
				System.out.println(hashMap.size());
				System.out.println(hashMap.replace("j", "john", "robert"));
			
	}

}
