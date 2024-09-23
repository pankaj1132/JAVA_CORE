public class SumOfEvenNumber {
        public static void main(String arg[]){
        int sum=0;
        for (int i = 4587; i > 0; i=i/10){
            int last_digit=i%10;
            if(last_digit%2==0){
                sum+=last_digit;
            }
        }
        System.out.println(sum);
        }
}
