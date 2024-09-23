// to print all the prime number 1 to 20
public class PrintPrimeNumber {
    public static void main(String arg[]) {
        for (int i = 2; i <= 20; i++) {
            int divisble = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    divisble++;
                }
            }

            if (divisble == 2) {
                System.out.println(i);
            }
        }
    }
}
