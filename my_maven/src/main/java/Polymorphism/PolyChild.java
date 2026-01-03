package Polymorphism;

public class PolyChild extends PolyParent
{
	@Override
	public void add()
	{
		int result1=a+b;
		System.out.println("Child Class: "+result1);
		//super.add();  we can use super keyword also
	}
	public static void main(String[] args) 
	{
		PolyChild ob=new PolyChild();
		ob.add();
		PolyParent obj1=new PolyParent();
		obj1.add();
	}
}
