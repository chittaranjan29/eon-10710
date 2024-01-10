package com.synchronization;

class Test1
{
	 public void print(int N,int T) // synchronized public void print(int N,int T)
	{
		synchronized (this) {
			 
			for(int i=N;i<=T;i++)
			{
				try
				{
					Thread.sleep(100);
				} 
				catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" : "+i);
				
			}
		}
	
	
	}
}

class T3 extends Thread
{
	Test1 t1;
	T3(Test1 t)
	{
		this.t1=t;
	}
	
	public void run()
	{
		t1.print(1, 100);
	}
}



class T4 extends Thread
{
	Test1 t1;
	T4(Test1 t)
	{
		this.t1=t;
	}
	
	public void run()
	{
		t1.print(101, 200);
	}
}

public class SynchronizedBlock {
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		
		T3 t1=new T3(test1);
		T4 t2=new T4(test1);
		
		t1.start();
		t2.start();
	}

}

