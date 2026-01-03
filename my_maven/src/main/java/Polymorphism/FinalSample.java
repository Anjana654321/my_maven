package Polymorphism;

public class FinalSample 
{
	final int a=10;
	public final void display()
	{
		//a=20;  Final cannot be assigned
		System.out.println("Final Variable: "+a);
	}
}
