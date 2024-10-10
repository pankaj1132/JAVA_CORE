package Array;

public class palindrome {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,3,2,1};
        int start=0;
        int end=arr.length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(arr[start]!=arr[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
