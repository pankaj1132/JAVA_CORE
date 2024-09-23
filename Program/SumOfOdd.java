public class SumOfOdd {
        public static void main(String arg[]){
        int sum=0,i=1;
        do {
            if(i%2!=0){
                sum=sum+i;
                i++;
            }
            else{
                i++;
            }
            System.out.println(sum);
        } while (i<=20);
        }
}

