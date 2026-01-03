package Abstraction;

public class AbsChildClass extends AbsClass
{
	public void print() //passing definition to the abstract method
	{
		System.out.println("Abstract Method");
	}
	public void add()
	{
		int a=3;
		int b=5;
		System.out.println("Addition result is: "+(a+b));
	}
	public static void main(String[] args) 
	{
		AbsChildClass ob=new AbsChildClass();
		ob.display();
		ob.print();
		ob.add();
	}

}
