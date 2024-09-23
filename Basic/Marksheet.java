import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter physics marks: ");
        int p=sc.nextInt();
        System.out.println("Enter chemistry marks: ");
        int c=sc.nextInt();
        System.out.println("Enter maths marks: ");
        int m=sc.nextInt();
        if(p>=33 && c>=33 && m>=33){
            int total=p+c+m;
            double percentage=(total/300.0)*100;
            System.out.println("Total marks: "+total);
            System.out.println("Percentage: "+percentage);
            if(percentage>=40){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
