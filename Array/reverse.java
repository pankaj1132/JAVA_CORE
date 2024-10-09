package Array;
public class reverse {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,89,6,7,8,9,10};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        //  2nd way
            // start=start + end;     
            // end = start-end;
            // start=start-end;


            // 3rd way
            // start = start*end;
            // end = start/end;
            // start= start/end;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
}} }
