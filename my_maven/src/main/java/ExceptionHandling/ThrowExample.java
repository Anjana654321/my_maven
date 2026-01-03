package ExceptionHandling;

public class ThrowExample 
{
	int acc_bal=6000;
	public void account() 
	{
		try
		{
			if(acc_bal<7000)
			{
				throw new ArithmeticException("No Minimum Balance"); 
			}
			else
			{
				System.out.println("sufficient balance");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		ThrowExample ob=new ThrowExample();
		ob.account();
	}
}
