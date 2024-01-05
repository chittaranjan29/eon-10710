package com.thread.java;

class NewThread extends Thread
{
	public NewThread(String threadName,ThreadGroup threadGroup ) {
		super(threadGroup, threadName);
		start();
	}
	
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

public class ThreadGroupExample {

	public static void main(String[] args) {
		
		ThreadGroup group1=new ThreadGroup("Parent Thread Group");
		
		NewThread t1=new NewThread("t1", group1);
		NewThread t2=new NewThread("t2", group1);
		NewThread t3=new NewThread("t3", group1);
		
		

		System.out.println(group1.activeCount());
		System.out.println(group1.activeGroupCount());
		
		
		ThreadGroup childgroup1=new ThreadGroup(group1, "Child thread group");
		NewThread t4=new NewThread("t4", group1);
		NewThread t5=new NewThread("t5", group1);
		NewThread t6=new NewThread("t6", group1);
		
		
		System.out.println(group1.getName());
		System.out.println(childgroup1.getName());
		System.out.println(group1.getMaxPriority()); 
		System.out.println(group1.activeCount());
		System.out.println(group1.activeGroupCount());
	}

}
