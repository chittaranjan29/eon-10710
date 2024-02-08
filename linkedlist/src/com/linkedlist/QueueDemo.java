package com.linkedlist;

class Queue
{
	private final int MAX;
	private int[] intArray;
	private int rear;
	private int front;
	private int itemCount;

	Queue(int size) {
	
		MAX = size;
		intArray=new int[MAX];
		front=0;
		rear=-1;
		itemCount=0;
	}
	public boolean isFull()
	{
		return itemCount==MAX;
	}
	
	
	public void insert(int data)
	{
		if(!isFull())
		{
			if(rear==MAX-1)
			{	
				rear=-1;
			}
			
			intArray[++rear]=data;
			itemCount++;
		}
		else
		{
			System.out.println("Queue is full!!");
		}
	}
	
	public int remove()
	{
		int data=intArray[front++];
		if(front==MAX)
		{
			front=0;
		}
		itemCount++;
		return data;
	}
	
	public int peek()
	{
		return intArray[front];
	}
	
	
	public boolean isEmpty()
	{
		return itemCount==0;
	}
	
	public int size()
	{
		return itemCount;
	}
	
	public void print()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(intArray[i]+" ");
		}
	}
	
	
	
	
}

public class QueueDemo {

	public static void main(String[] args) {
		
	Queue queue=new Queue(5);
	
	queue.insert(10);
	queue.insert(20);
	queue.insert(30);
	queue.insert(40);
	queue.insert(50);
	
	queue.isFull();
	
	queue.remove();
	
	queue.print();
	
	
	}

}
