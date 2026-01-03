package my_interface;

public class SampleClass implements SampleInterface
{
	public void print()
	{
		System.out.println("Hello world");
	}
	public void add()
	{
		System.out.println("The sum is "+(a+b));
	}
	public void display()
	{
		System.out.println("Hiiiiiiiiiiiii");
	}
	public static void main(String[] args) 
	{
		SampleClass ob=new SampleClass();
		ob.print();
		ob.add();
		ob.display();
		SampleInterface ob1=new SampleClass();
		System.out.println("Value of a is "+ob1.a);
		System.out.println("Value of b is "+b);
		//ob1.add(); we can only call properties from interface using interface object
	}
}
