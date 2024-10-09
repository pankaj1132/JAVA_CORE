package Array;
import java.util.Scanner;
public class BasicArray{
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the Numbers ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}