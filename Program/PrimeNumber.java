public class PrimeNumber {
    public static void main(String arg[]) {
        int n = 13;
        int divisble=0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                divisble++;
            }
        }
        if(divisble==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not A Prime Number");

        }
    }
} 