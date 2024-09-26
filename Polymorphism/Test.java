package Polymorphism;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a;
		System.out.println("Which type of account you want to open \n1.Saving \n2.Current");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				 a = new SavingAccount();
				 System.out.println("enter the name");
				 String name=sc.next();
				 System.out.println("enter the account number");
				 long l = sc.nextLong();
				 a.createAccount(name, l);
				 
				 SavingAccount s = (SavingAccount)a;
				 s.getAccountDetails();
			}
			break;
			case 2:
			{
				 a = new CurrentAccount();
				 System.out.println("enter the name");
				 String name=sc.next();
				 System.out.println("enter the account number");
				 long l = sc.nextLong();
				 a.createAccount(name, l);
				 
				 CurrentAccount s = (CurrentAccount)a;
				 s.getAccountDetails();
			}
			break;
			
			default: System.out.println("invalid choice"); 
		}
		sc.close();
		
	}
}
