package ExceptionHandling;

public class Exception1
{
	int a=10;
	public void print()
	{	
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{	
			System.out.println("Exception handle");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	public static void main(String[] args) 
	{	
		Exception1 ob=new Exception1();
		System.out.println("Before Exception");
		ob.print();
		System.out.println("After Exception");
	}

}
