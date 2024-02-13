package com.test.prime;

import java.util.Scanner;

class Node
{
	public int data;
	public Node leftChild;
	public Node rightChild;
	
	public Node() {
		
	}
	
	public void display()
	{
		System.out.println("("+data+")");
	}
		
}

class Tree
{
	private Node root;

	public Tree() {
	 
		root=null;
	}
	
	public void insert(int data)
	{
		Node tmpNode=new Node();
		tmpNode.data=data;
		
		if(root==null)
		{
			root=tmpNode;
		}
		else
		{
			Node current=root;
			Node parent=null;
			
			
			while(true)
			{
				parent=current;
				//goes to the left of the tree
				if(data<parent.data)
				{
					current=current.leftChild;
					if(current==null)
					{
						parent.leftChild=tmpNode;
						return;
					}
				}
				else		//goes to the right of the tree
				{
					current=current.rightChild;
					if(current==null)
					{
						parent.rightChild=tmpNode;
						return;
					}
				}
				
			}
		}
	}
	
	
	public Node search(int data)
	{
		Node current=root;
		  
		while(current.data!=data)
		{
			if(current.data>data)
			{
				current=current.leftChild;
			}
			else
			{
				current=current.rightChild;
			}
			
			if(current==null)
			{
				return null;
			}
			
			
		}
		return current;
	}
	
	private void preOrder(Node root)//Root-Left-right
	{
		if(root!=null)
		{
			System.out.print(root.data+ " ");
			preOrder(root.leftChild);
		    preOrder(root.rightChild);
		}
	}
	
	private void postOrder(Node root)//Left-right-Root
	{
		if(root!=null)
		{
			preOrder(root.leftChild);
			preOrder(root.rightChild);
			System.out.print(root.data+ " ");
		}
	
	}
	
	private void inOrder(Node root)//Left-root-right
	{
		if(root!=null)
		{
			inOrder(root.leftChild);
			System.out.print(root.data+ " ");
			inOrder(root.rightChild);
			
		}
	
	}
	
	public void traverse(int traversalType)//  x1/2/3
	{
		switch(traversalType)
		{
			case 1: System.out.println("\n Preorder Traversal:");
			 		preOrder(root);
				    break;
			case 2:	System.out.println("\n Inorder Traversal:");
					inOrder(root);
					break;
			case 3:	System.out.println("\n Postorder Traversal:");	
					postOrder(root);
					break;	
			default:System.out.println("\n Wrong Choice..");		
		
		}
		
	}
	
	
	
}


public class TreeDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		Tree tree=new Tree();
		
		tree.insert(10);
		tree.insert(60);
		tree.insert(30);
		tree.insert(90);
		tree.insert(160);
		tree.insert(47);
		tree.insert(95);
		tree.insert(7);
		
		
		Node node=tree.search(7);
		if(node!=null)
		{
			System.out.println("Element Found!!");
			node.display();
			System.out.println();
		}
		else
		{
			System.out.println("Element Not Found!!");
		}
		
		
		System.out.println("Enter Traversal Type:\n 1->PreOrder \n 2->InOrder \n 3->PostOrder");
		int traversalType=scanner.nextInt();
		tree.traverse(traversalType);
		
		
		
		
		
	}

}
