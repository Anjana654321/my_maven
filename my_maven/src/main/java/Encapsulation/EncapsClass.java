package Encapsulation;

public class EncapsClass 
{
	private int age;
	private String name;
	
	public void setterMethod(int age, String name)
	{
		this.age=age;
		this.name=name;
		if(age>=18)
		{
			System.out.println("Eligible for Driving license");
		}
		else
		{
			System.out.println("Not eligible for Driving license");
		}
	}
	public void getterMethod()
	{
		//age=age*2;
		System.out.println("Age is: "+age);
		System.out.println("Name is: "+name);
	}
}