package Array;

public class seocndLargest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,89,6,7,8,9,10};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
            else if(secondMax<arr[i] && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        System.out.println("maximum Number is "+ max);
        System.out.println("Second Largest Number is "+ secondMax);
    }
    


}
