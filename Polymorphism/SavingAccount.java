package Polymorphism;

public class SavingAccount extends Account
{
	long accountNo;
	int bal;
	
	@Override
	public void createAccount(String name,long accountNo)
	{
		super.setName(name);
		this.accountNo=accountNo;
		this.bal=100;
		System.out.println("saving account has been created for user: ");
	}
	
	public int getBal()
	{
		return bal;
	}
	
	public void getAccountDetails()
	{
		System.out.println("account holder's name: "+super.getName());
		System.out.println("Account number is: "+this.accountNo);
		System.out.println("bal is : "+this.bal);
	}
	
	
	
	
}
