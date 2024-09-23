import java.util.Scanner;

public class NumberOrDigit {
    public static void main(String [] args){
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=-9 && n<=9){
            System.out.println("Digit");
        }
        else{
            System.out.println("Number");
        }
        sc.close();
    }
}
