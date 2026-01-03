/* class 1: bank account
variables- account number, balance
setter -collect the account no and balance from user
getter -getting account number and balance
create method to deposit amount.(need to add with balance amount)
need to print : account number, balance, deposit , total balance in class2 */


package Encapsulation;

public class BankAccount 
{
	private int acc_no;
	private int acc_bal;
	public void setter(int acc_no,int acc_bal)
	{
		this.acc_no=acc_no;
		this.acc_bal=acc_bal;
	}	
	public void getter()
	{
		System.out.println("Account No: "+acc_no);
		System.out.println("Account Balance: "+acc_bal);
	}
	public void deposite(int dep_amt)
	{
		int tot_bal=dep_amt+acc_bal;
		System.out.println("Deposite Amount: "+dep_amt);
		System.out.println("Total Balance: "+tot_bal);
	}
}
