package com.test;

import java.util.Iterator;
import java.util.Vector;

public class VoctorExample {

	public static void main(String[] args) {
		
		Vector<Float> vector=new Vector<Float>(12);
		
		vector.add(12.56f);
		vector.add(15.77f);
		vector.add(17.11f);
		vector.add(19.22f);
		vector.add(55.56f);
		vector.add(77.56f);
		System.out.println(vector);
		
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		Iterator<Float> iterator=vector.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
