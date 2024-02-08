package com.linkedlist;
class Stack
{
	private int size;
	private int[] intArray;
	private int top;
	
	
	public Stack(int size) {
		this.size = size;
		intArray=new int[size];
		top=-1;
	}
	
	public boolean isFull()
	{
		return (top==size-1);
	}
	
	public void push(int data)
	{
		if(!isFull())
		{
			intArray[++top]=data;
		}
		else
		{
			System.out.println("Can not insert data. Stack is full!!");
		}
	}
	
	
	public int pop()
	{
		
		return intArray[top--];
	}
	
	
	public int peek()
	{
		return intArray[top];
	}
	
	public void print()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(intArray[i]+ " ");
		}
	}
	
	
	
	
	
}


public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack=new Stack(10);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		
		stack.print();
		
		stack.push(110);
		
		stack.pop();
		System.out.println();
		stack.print();
		
		System.out.println();
		System.out.println(stack.peek());
		stack.print();
		
	}

}
