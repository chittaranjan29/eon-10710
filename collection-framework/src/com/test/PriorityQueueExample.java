package com.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Double> priorityQueue=new PriorityQueue<Double>() ;
		
		priorityQueue.add(11.35);
		priorityQueue.add(17.25);
		priorityQueue.add(37.11);
		priorityQueue.add(8.99);
		priorityQueue.add(18.35);
		priorityQueue.add(12.35);
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.element());
		System.out.println(priorityQueue.offer(67.3));
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		

	}

}
