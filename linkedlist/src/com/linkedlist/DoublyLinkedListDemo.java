package com.linkedlist;
class Node
{
	public int key;
	public int data;
	public Node pre;
	public Node next;
	
	public Node(int key, int data) {
	
		this.key = key;
		this.data = data;
	}
	
	public void display()
	{
		System.out.print("{"+key+", "+data+" }");
	}
		
}

class DoublyLinkedList{
	
	
	private Node first;
	private Node last;
	
	public DoublyLinkedList()
	{
		first=null;
		last=null;
	}
	
	
	public boolean isEmpty()
	{
		return 	first==null;
		
	}
	
	
	public void insertFirst(int key, int data)
	{
		Node newNode=new Node(key, data);
		
		if(isEmpty())
		{
			last=newNode;
		}
		else
		{
			first.pre=newNode;
		}
		
		newNode.next=first;
		first=newNode;
		
		
	}
	
	
	public void insertLast(int key, int data)
	{
		Node newNode=new Node(key, data);
		if(isEmpty())
		{
			last=newNode;
		}
		else
		{
			last.next=newNode;
			newNode.pre=last;
		}
		
		last=newNode;
	}
	
	
	public Node deleteFirst()
	{
		Node tempNode=first;
		if(first.next==null)
		{
			last=null;
		}
		else
		{
			first.next.pre=null;
		}
		
		first=first.next;
		return tempNode;
	}
	
	public Node deleteLast()
	{
		Node tempNode=first;
		if(first.next==null)
		{
			first=null;
		}
		else
		{
			last.pre.next=null;
		}
		
		last=last.pre;
		return tempNode;
	}
	
	public void forwardDirection()
	{
		Node current=first;
		System.out.print("[ ");
		while(current!=null)
		{
			current.display();
			
			current=current.next;
			System.out.print(" ");
			
		}
		
		System.out.print(" ]");
	}
	public void backwardDirection()
	{
		Node current=last;
		System.out.print("[ ");
		while(current!=null)
		{
			current.display();
			
			current=current.pre;
			System.out.print(" ");
			
		}
		
		System.out.print(" ]");
	}
	
}








class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList linkedList=new DoublyLinkedList();
		
		linkedList.insertFirst(1, 10);
		linkedList.insertFirst(2, 20);
		linkedList.insertFirst(3, 30);
		linkedList.insertFirst(4, 40);
		linkedList.insertFirst(5, 50);
		linkedList.insertFirst(6, 60);
		
		System.out.println("\nList(Forward):");
		linkedList.forwardDirection();
		System.out.println("\nList(Backward):");
		linkedList.backwardDirection();
		
		linkedList.deleteFirst();
		linkedList.deleteLast();
		
		System.out.println("\nList(Forward):");
		linkedList.forwardDirection();
		
		
		
	}

}
