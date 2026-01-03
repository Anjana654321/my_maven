package Assignments;

public class Car extends Vehicle
{
	int tire;
	public Car(String color,int tire)
	{
		super("Hyundai");
		this.tire=tire;
		System.out.println(color);
	}
}
