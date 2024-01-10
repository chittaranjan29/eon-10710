package com.synchronization;
class Test
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

class T1 extends Thread
{
	Test t1;
	T1(Test t)
	{
		this.t1=t;
	}
	
	public void run()
	{
		t1.print(1, 100);
	}
}



class T2 extends Thread
{
	Test t1;
	T2(Test t)
	{
		this.t1=t;
	}
	
	public void run()
	{
		t1.print(101, 200);
	}
}

public class SynchronizedMethod {
	
	public static void main(String[] args) {
		Test test=new Test();
		
		T1 t1=new T1(test);
		T2 t2=new T2(test);
		
		t1.start();
		t2.start();
	}

}
