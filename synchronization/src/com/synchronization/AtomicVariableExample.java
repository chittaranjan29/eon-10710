package com.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
	AtomicInteger count=new AtomicInteger();
	//int count=0;
	public void increment()
	{
		count.incrementAndGet();
		//count++;
	}
}




public class AtomicVariableExample {

	public static void main(String[] args) {
		
		Counter counter=new Counter();
		
		
		Thread t1=new Thread()
				{
				  public void run()
				  {
					  for(int i=1;i<=2000;i++)
					  {
						  counter.increment();
					  }
				  }
				};
				
				
		Thread t2=new Thread()
				{
				  public void run()
				  {
					  for(int i=1;i<=2000;i++)
					  {
						  counter.increment();
					  }
				  }
				};			
				
				
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(counter.count);
	}
	
	

}
