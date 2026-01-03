package Assignments;

public class SuperChildExample extends SuperParentExample
{
	String h="Anjana";
	public SuperChildExample(String r)
	{
		super();
		System.out.println(r);
	}
	public void print()
	{
		System.out.println(h);
		System.out.println(super.s);
		super.add();
	}
	public static void main(String[] args) 
	{
		SuperChildExample ob=new SuperChildExample("World");
		ob.print();
	}
}
