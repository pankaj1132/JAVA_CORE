package Array;
import java.util.Scanner;
public class BasicArray{
    public static void main(String[] args) {
        int n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
         n =sc.nextInt();

        int [] arr=new int[n];
       
        System.out.println("Enter The Number");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the Numbers ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}