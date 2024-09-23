// find sum of each digit in a given number
public class SumOfDigit {
        public static void main(String arg[]){
        int sum=0;
        int d=15482;
        do {
            sum=sum+d%10;
            d=d/10;
        } while (d!=0);
        System.out.println(sum);
        }
}
