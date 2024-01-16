package com.test;

interface Printable
{
	void print(String message);
}


interface Iaverage
{
	double avg(int[] array);
}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		
		Printable printable=msg->
		{
			System.out.println(msg.toUpperCase());
		};
		
		printable.print("print method invoked");
		
		int array[]= {1,5,7,8,56};
		
		Iaverage iaverage=(darray)->{
			
			double sum=0;
			int length=darray.length;
			for(int i=0;i<length;i++)
			{
				sum=sum+darray[i];
			}
			
			return (sum/length);
		};
		
		
		System.out.println(iaverage.avg(array));
		

	}

}
