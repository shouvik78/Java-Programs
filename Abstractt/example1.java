package Abstractt;

abstract class vehicle
{
	void car()
	{
		System.out.println("This is my car");
	}
	abstract void bike();
}
class honda extends vehicle
{
	void bike()
	{
		System.out.println("Bike is running");
	}
}

public class example1 {

	public static void main(String[] args) {
		
		honda obj=new honda();
		obj.car();
		obj.bike();

	}

}
