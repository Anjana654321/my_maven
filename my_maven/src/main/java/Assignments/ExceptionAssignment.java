package Assignments;

public class ExceptionAssignment 
{
	String a=null;
	public void print()
	{
		try
		{
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
	public static void main(String[] args) 
	{
		ExceptionAssignment ob=new ExceptionAssignment();
		ob.print();
	}

}
