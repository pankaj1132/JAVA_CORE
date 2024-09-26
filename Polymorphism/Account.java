package Polymorphism;

public class Account {
	
	private String name;
	private long accountNo;
	private int bal;
	
	public void createAccount(String name,long accountNo)
	{
		this.name=name;
		this.accountNo=accountNo;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBal(int bal)
	{
		this.bal=this.bal+bal;
	}
	
	public int getBal()
	{
		return bal;
	}
	
	
	
}
