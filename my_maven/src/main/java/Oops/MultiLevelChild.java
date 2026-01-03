package Oops;

public class MultiLevelChild extends MultiLevelParent
{
	public void mul()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		MultiLevelChild obj=new MultiLevelChild();
		obj.mul();
		obj.sub();
		obj.print();
		System.out.println(obj.place);
		System.out.println(obj.a);
	}
}
