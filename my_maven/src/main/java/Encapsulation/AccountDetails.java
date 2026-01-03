package Encapsulation;

public class AccountDetails 
{
	public static void main(String[] args) 
	{
		BankAccount ob=new BankAccount();
		ob.setter(654321,8000);
		ob.getter();
		ob.deposite(5000);
	}
}
