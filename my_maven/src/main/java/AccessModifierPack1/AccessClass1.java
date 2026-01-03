package AccessModifierPack1;

public class AccessClass1 
{
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public void print() 
	{
		System.out.println(a);
	}
	private void print1() 
	{
		System.out.println(b);
	}
	protected void print2() 
	{
		System.out.println(c);
	}
	void print3() 
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		AccessClass1 ob=new AccessClass1();
		//System.out.println(ob.a);
		//System.out.println(ob.b);
		//System.out.println(ob.c);
		//System.out.println(ob.d);
		ob.print();
		ob.print1();
		ob.print2();
		ob.print3();
	}
}
