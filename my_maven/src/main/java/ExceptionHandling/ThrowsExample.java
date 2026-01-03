package ExceptionHandling;

public class ThrowsExample 
{
	public static void print(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible For License");
		}
	}
	public static void main(String[] args) throws LicenseException 
	{
		ThrowsExample.print(12);
	}
}
