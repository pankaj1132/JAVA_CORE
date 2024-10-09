package  MultipleInheritance;
import java.util.Scanner;
public class TestMarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Seller se=new Seller();
            System.out.println("Enter number of user");
            double user=sc.nextDouble();
            System.out.println("Enter number of items");
            double items=sc.nextDouble();
            se.set_demand(user, items);
            se.manipulate();
            se.sale();
            // System.out.println(se.demand);
        sc.close();
    }
}
