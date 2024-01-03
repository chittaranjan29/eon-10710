package com.thread.java;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(currentThread().getName()+":"+ i);
			/*
			 * try { currentThread().sleep(2000, 10); } catch (InterruptedException e) {
			 * 
			 * 
			 * e.printStackTrace(); }
			 */
		}
	}
}


public class ThreadCreateExample1 {

	public static void main(String[] args) {
		
		Mythread t1=new Mythread();
		t1.start();
		
		Mythread t2=new Mythread();
		t2.start();
	}

}
