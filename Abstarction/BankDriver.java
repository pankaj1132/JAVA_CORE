package Abstarction;

public class BankDriver extends bank {
    public double checkbal(){
        return bal;
    }
    
    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("inavlid input");
        }
        else{
            if (amount<=bal) {
                System.out.println(amount +"withdraw successfully>>>");
                super.bal-=amount;
                
            }
            else{
                System.out.println("insufficient bal");
            }
        }

    }

    public  void deposite(double amount){
        if(amount <=0){
            System.out.println("invalid amount");
        }
        else{
            super.bal +=amount;
            System.out.println("amount id deposite :"+super.bal);
        }
    }

   
    
}
