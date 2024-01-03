package com.thread.java;


class SampleThread implements Runnable
{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
	
}
public class ThreadCreateExample2 {

	public static void main(String[] args) {
		
		SampleThread t1=new SampleThread();
		Thread thread1=new Thread(t1);
		
		thread1.start();
				
		

	}

}
