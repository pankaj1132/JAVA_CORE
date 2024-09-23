package Encapsulation;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int a = sc.nextInt();
        System.out.println("Enter your age:");
        int b = sc.nextInt();
        System.out.println("Your name is: "+name);
        System.out.println("addition of two numbers is: "+(a+b));
        sc.close();
    }
}
