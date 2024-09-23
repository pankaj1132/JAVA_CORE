public class PerfectNumber {
        public static void main(String arg[]){
            int sum=0;
            int num=28;
            for (int i = 1; i <=num/2 ; i++) {
                if(num%i==0){
                    System.out.print(i+" ");
                    sum=sum+i;
                }
            }
        System.out.println();
        if(sum==num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not A Perfect Number");
        }
    }
}
