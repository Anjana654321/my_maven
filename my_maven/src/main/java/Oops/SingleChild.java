package Oops;

public class SingleChild extends SingleParent
{
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		SingleChild obj=new SingleChild();
		obj.add();
		obj.mul();
		System.out.println(obj.a);
	}
}
