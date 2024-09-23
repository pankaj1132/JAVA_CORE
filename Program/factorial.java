public class factorial {
    public static void main(String arg[]) {
        int fact = 1;
        for (int i = 5; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    } 
}
