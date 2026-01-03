package Oops;

public class SuperChild extends SuperParent
{
	public void add()
	{
		int a=10;
		System.out.println(a);
		System.out.println("Calling variable using Super keyword: "+super.s);
		super.print();
	}
	public SuperChild(int b)
	{
		super();
		System.out.println("Parameterised Constructor");
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		SuperChild ob=new SuperChild(12);
		ob.add();
	}

}
