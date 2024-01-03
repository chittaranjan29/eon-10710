package com.thread.java;

public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		Mythread t3=new Mythread();
		
		
		t1.start();
		
			
		t1.join();
		
		
		t2.start();
		
		t2.join();
		
		t3.start();
	}

}
