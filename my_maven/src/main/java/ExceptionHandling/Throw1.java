package ExceptionHandling;

public class Throw1 
{
	public static void print(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Not Eligible");
			}
			else
			{
				System.out.println("Eligible For License");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		Throw1.print(15);
	}
}
