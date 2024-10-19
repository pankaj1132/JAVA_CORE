package Array;


public class longest_increasing_subaaray {
    public static int lenOfLongIncSubArr(int arr[], int n) {
        int max = 1, len = 1;
        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1])
                len++;
            else {
                if (max < len) 
                    max = len;
                len = 1;
            } 
        }
        if (max < len)
            max = len;
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,11,6,10,14,16,1,20};
        int n = arr.length;
        System.out.println("Length = " + lenOfLongIncSubArr(arr, n));
    }
    
}
