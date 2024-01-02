package com.test;
 interface Vehicle {
	
	 //final by default
	int gearNumber=0;  // final int gerNumber=0;
	int speed=0;
  
	
	//abstract methods
	void changeGear(int gearNumber); // abstract void changeGear(int gearNumber);
	void speedUp(int speed);
	void slowDown(int speed);
	void applyBrakes();
	
	default  void turnOnIndicator()
	{
		System.out.println("indicator is on");
		sample();//calling private method
	}
	
	default  void turnOffIndicator()
	{
		System.out.println("indicator is off");
	}
	
	static void test()
	{
		System.out.println("This is a static method");
		
	}
	
	private void sample()
	{
		System.out.println("This is a private method");
	}
	   
}

class Bike implements Vehicle
{
	int gearNumber;
	int speed;
	
	public Bike()
	{
		 gearNumber=0;
		 speed=0;
	}

	@Override
	public void changeGear(int gearNumber) {
		
		this.gearNumber=this.gearNumber+1;
	}

	@Override
	public void speedUp(int incresedSpeed) {
		
		this.speed=this.speed + incresedSpeed;
		
	}

	@Override
	public void slowDown(int decresedSpeed) {
		
		this.speed=this.speed - decresedSpeed;
	}

	@Override
	public void applyBrakes() {
		
		this.speed = 0;
	}
	
	void print()
	{
		System.out.println("Gear Number = "+this.gearNumber);
		System.out.println("Speed = "+this.speed);
	}
	
}


class Bicycle implements Vehicle
{
	int gearNumber;
	int speed;
	
	public Bicycle()
	{
		 gearNumber=0;
		 speed=0;
	}

	@Override
	public void changeGear(int gearNumber) {
		
		this.gearNumber=this.gearNumber+1;
	}

	@Override
	public void speedUp(int incresedSpeed) {
		
		this.speed=this.speed + incresedSpeed;
		
	}

	@Override
	public void slowDown(int decresedSpeed) {
		
		this.speed=this.speed - decresedSpeed;
	}

	@Override
	public void applyBrakes() {
		
		this.speed = 0;
	}
	void print()
	{
		System.out.println("Gear Number = "+this.gearNumber);
		System.out.println("Speed = "+this.speed);
	}
}




class InterfaceExample
{
	public static void main(String args[])
	{
		Bike bike=new Bike();
		bike.changeGear(3);
		bike.speedUp(20);
		bike.slowDown(5);
		bike.turnOnIndicator();
		bike.turnOffIndicator();
		bike.applyBrakes();
		bike.print();
		Vehicle.test();
		
		
		Bicycle bicycle=new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(10);
		bicycle.turnOnIndicator();
		bicycle.turnOffIndicator();
		bicycle.slowDown(3);
		bicycle.applyBrakes();
		bicycle.print();
		Vehicle.test();
		
	}
}
