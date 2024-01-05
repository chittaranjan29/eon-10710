package com.thread.java;
class DemoTHread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class ThreadPriorityExample {

	public static void main(String[] args) {
		DemoTHread d1=new DemoTHread();
		d1.setPriority(Thread.MAX_PRIORITY);
		DemoTHread d2=new DemoTHread();
		d2.setPriority(1);
		
		d1.start();
		d2.start();
		
		
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
	}

}
