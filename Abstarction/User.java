package Abstarction;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b = new BankDriver();

        boolean istrue = true;
        while (istrue) {

            System.out.println("enter what u want /n 1.check balance\n2.withdraw\n3.deposite");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("your current balance is :" + b.checkbal());
                    break;
                }
                case 2: {
                    System.out.println("enter the amount to withdraw");
                    double amount = sc.nextDouble();
                    b.withdraw(amount);
                    break;
                }
                case 3: {
                    System.out.println("enter the amount to deposite");
                    double amount = sc.nextDouble();
                    b.deposite(amount);
                    break;
                }
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
        System.out.println("do you want to continue press 1 for yes and 0 for no");
        char c = sc.next().charAt(0);
        if (c == '0') {
            istrue = true;
        } else {
            istrue = false;

        }
        sc.close();
    }
}
