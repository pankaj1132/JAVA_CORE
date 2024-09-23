public class SumOfPrimeNumber {
        public static int isPrime(int n1){
            int divisble=0;
            for(int i=2;i<=n1/2;i++){
                if(n1%i==0){
                    divisble++;
                    break;
                }
            }
            if(divisble==0){
                return n1;
            }
            else{
                return 0;
            }
        }
        public static int sum(int n1,int n2){
            int sum=0;
            for(int i=n1;i<=n2;i++){
                sum+=isPrime(i);
            }
            return sum;
        }
        public static void main(String arg[]){
        System.out.println(sum(2,10));
        }
}
