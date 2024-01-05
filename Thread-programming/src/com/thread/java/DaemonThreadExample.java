package com.thread.java;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DemoTHread d1=new DemoTHread();
		DemoTHread d2=new DemoTHread();
		DemoTHread d3=new DemoTHread();
				
		d1.setDaemon(true); 
		d1.start();
		d2.start();
		d3.start();
		
		System.out.println(d1.isDaemon());
		System.out.println(d2.isDaemon());
		System.out.println(d3.isDaemon());
	}

}
