package Array;

public class sum {
    
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(sum/arr.length));
    }
}
