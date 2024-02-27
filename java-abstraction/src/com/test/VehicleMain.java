package com.test;

 interface Vehicle{

	//abstract methods
    void changeGear(int grarNumber); 
	void speedUp(int speed);
	void slowDown(int speed);
	void applyBrakes(int speed);
	//common functionalities should be defined using default method
	
	default void turnIndicator(boolean status)
	{
		if(status==true)
		{
			System.out.println("Turn indicator on");
		}
		else
		{
			System.out.println("Turn indicator off");
		}
	}
	
	static void test()
	{
		System.out.println("static method invoked");
		testPrivate();
	}
	
	private static void testPrivate()
	{
		System.out.println("private method invoked");
	}
	
}

class BiCycle implements Vehicle
{
	int speed;
	int gear;

	@Override
	public void changeGear(int gearNumber) {
		
		this.gear=gearNumber;
		
	}

	@Override
	public void speedUp(int incrementedSpeed) {
		
		this.speed=this.speed+incrementedSpeed;
	}

	@Override
	public void slowDown(int decrementedSpeed) {
		this.speed=this.speed - decrementedSpeed;
		
	}

	@Override
	public void applyBrakes(int speed) {
		
		this.speed=this.speed - speed;
		
	}
	
	void display()
	{
	 System.out.println("Speed="+this.speed+ "\n" +"Gear="+this.gear);
	}
	
}




class VehicleMain
{
	public static void main(String args[]) 
	{
		BiCycle biCycle=new BiCycle();
		biCycle.changeGear(2);
		biCycle.speedUp(10);
		biCycle.slowDown(2);
		biCycle.turnIndicator(true);
		biCycle.display();
		Vehicle.test();
	}
}
