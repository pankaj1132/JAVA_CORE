
package market_interface;

import java.util.Scanner;

 public class seller extends user implements market {
    
          
    public void manipulation() {
        
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of user");

        double user = sc.nextDouble();

        System.out.println("enter the items");
        double items = sc.nextDouble();

        double demand = user/items;
            if(demand<1){
                System.out.println("sale of 20% discount" );
             double price = super.price*0.2;
             super.price = super.price-price;
             System.err.println( "price after 20% of discount"+super.price);
                break;
            }
            else if(demand>1){
                
                double price = super.price*0.3;
                super.price = super.price+price;
                System.err.println( super.price);
                   break;
            }
            else if (demand==1){
                System.out.println("price at normal days"+super.price);
                break;
            }

            sc.close();
            
            
            
        }
    }
    

    public static void main(String[] args) {
        seller s = new seller();
          s.manipulation();
    }


}
