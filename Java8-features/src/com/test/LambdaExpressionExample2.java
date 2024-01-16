package com.test;
interface NumberChecking 
{
	public String primeCheck(int n);
}
public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		NumberChecking numberChecking=(int num) ->{
			
			boolean flag=true;
			
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				return "Prime Number";
			}
			else
			{
				return "Composite Number";
			}
		};
		
		System.out.println(numberChecking.primeCheck(7));
		System.out.println(numberChecking.primeCheck(12));
	}

}
