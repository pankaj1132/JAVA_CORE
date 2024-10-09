package Array;
import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum Number is "+ max);
        sc.close();
    }
}
