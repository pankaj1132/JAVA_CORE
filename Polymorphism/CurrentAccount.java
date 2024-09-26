package Polymorphism;

public class CurrentAccount extends Account
{
	long accountNo;
	int bal;
	
	@Override
	public void createAccount(String name,long accountNo)
	{
		super.setName(name);
		this.accountNo=accountNo;
		this.bal=100;
		System.out.println("current account has been created for user: ");
	}
	
	public void getAccountDetails()
	{
		System.out.println("account holder's name: "+super.getName());
		System.out.println("Account number is: "+this.accountNo);
		System.out.println("bal is : "+this.bal);
	}
	
	public int getBal()
	{
		return bal;
	}
}
