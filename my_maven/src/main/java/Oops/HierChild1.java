package Oops;

public class HierChild1 extends HierParent
{
	public void print()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		HierChild1 ob=new HierChild1();
		ob.add();
		ob.print();
	}
}
