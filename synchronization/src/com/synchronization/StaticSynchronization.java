package com.synchronization;
class MultiplicationTable
{
	synchronized static public void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " * "+i+" = "+n*i);
		}
	}
}


class Table1 extends Thread
{
	public void run()
	{
		MultiplicationTable.printTable(7);
	}
}


class Table2 extends Thread
{
	public void run()
	{
		MultiplicationTable.printTable(9);
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		
		Table1 table1=new Table1();
		Table2 table2=new Table2();
		
		table1.start();
		table2.start();
	}

}
