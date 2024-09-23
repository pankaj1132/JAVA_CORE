public class ArmstrongNumber {
    public static int count(int n) {
        int count = 1;
        for (int i = 0; i <= n; i++) {
            n = n / 10;
            count++;
        } 
        return count;
    }

    public static int power(int m,int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power=power*m;
        }
        return power;
    }
    public static boolean calculate_sum(int num){
        int sum=0;
        int num2=num;
        int n=count(num);
        for(int i=1;i<=n;i++){
            int digit=num%10;
            sum=sum+power(digit, n);
            num=num/10;
        }
        if(num2==sum)
            return true;
        else{
            return false;
        }
    }
    public static void main(String arg[]) {
        System.out.println(calculate_sum(153));
    }
}
