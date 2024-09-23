import java.util.*;
public class greater {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        int big=a;
        if(b>a){
            big=b;
        }
        if(c>a){
            big=c;
        }
        System.out.println("bigger number is "+big);
        sc.close();
    }
}
