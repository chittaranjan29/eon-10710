package com.linkedlist;
 class Link
{
	public int key;
	public int data;
	public Link next;
	
	public Link() {
		
	}

	public Link(int key, int data) {
		
		this.key = key;
		this.data = data;
	
	}
	
	
	public void display()
	{
		System.out.print("{"+key+", "+data+"}");
	}
	
	
}
 
 
 class LinkedList
 {
	 private Link first;

	public LinkedList() {
		first=null;
	}
	
	
	
	public void insertFirst(int key, int data)
	{
		Link link=new Link(key, data);
		link.next=first;
		first=link;
		
	}
	
	public Link deleteFirst()
	{
		Link tempLink=first;
		first=first.next;
		return tempLink;
	}
	
	
	
	public Link delete(int key)
	{
		Link current=first;
		Link previous=null;
		
		
		if(first==null)
			return null;
		
		while(current.key!=key)
		{
			if(current.next==null)
			{
				return null;
			}
			else
			{
				previous=current;
				current=current.next;
			}
		}
		
		if(current==first)
		{
			first=first.next;
		}
		else
		{
			previous.next=current.next;
		}
		
		return current;
	}
	
	public void display()
	{
		Link current=first;
		
		System.out.print("[");
		while(current!=null)
		{
			current.display();
			current=current.next;
			System.out.print(" ");
			
		}
		System.out.print("]");
	}
	
	public Link find(int key)
	{
		Link current=first;
		
		
		if(first==null)
			return null;
		
		while(current.key!=key)
		{
			if(current.next==null)
			{
				return null;
			}
			else
			{
				current=current.next;
			}
		}
		
		return current;
		
	}
	 
	 
 }



public class SinglyLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList list=new LinkedList();
		list.insertFirst(1, 11);
		list.insertFirst(2, 22);
		list.insertFirst(3, 33);
		
		Link foundLink=list.find(5);
		if(foundLink!=null)
		{
			foundLink.display();
		}
		else
		{
			System.out.println("Element not found!!");
		}
		System.out.println();
		list.display();
		System.out.println("After delete first node:");
		list.deleteFirst();
		list.display();
		
		System.out.println("After delete any node:");
		list.delete(1);
		System.out.println("After delete first node:");
		list.display();
}
}
