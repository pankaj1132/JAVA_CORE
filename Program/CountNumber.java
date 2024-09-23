//count number of count in given number
public class CountNumber {
    public static void main(String arg[]) {
        int i = 145452, count = 0;
        do {
            i = i / 10;
            count++;
        } while (i != 0);
        System.out.println(count);
    }
}
