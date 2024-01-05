package com.thread.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskThread implements Runnable
{
	private String name;
	
	public TaskThread(String name)
	{
		this.name=name;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=50;i++)
		{
			if(i==1)
			{
				Date date=new Date();
				SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss");
				System.out.println(this.name +" : "+ "started at "+dateFormat.format(date));
			}
			else
			{
				Date date=new Date();
				SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss");
				System.out.println(this.name +" : "+ i +" "+dateFormat.format(date));
			}
			
		}
		
		System.out.println(this.name + "completed");
		
	}
	
}


public class ThreadPoolExample {

	public static void main(String[] args) {
		
		final int POOL_SIZE=3;
		
		TaskThread task1=new TaskThread("Task 1");
		TaskThread task2=new TaskThread("Task 2");
		TaskThread task3=new TaskThread("Task 3");
		TaskThread task4=new TaskThread("Task 4");
		TaskThread task5=new TaskThread("Task 5");
		
		
		
		ExecutorService pool=Executors.newFixedThreadPool(POOL_SIZE);
		
		
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		pool.execute(task4);
		pool.execute(task5);
		
		
		pool.shutdown();
		
	}

}
