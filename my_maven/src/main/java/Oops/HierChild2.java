package Oops;

public class HierChild2 extends HierParent
{
	public void sub()
	{
		int c=3;
		System.out.println(a-c);
	}
	public static void main(String[] args)
	{
		HierChild2 ob1=new HierChild2();
		System.out.println(ob1.s);
		ob1.sub();
	}
}
