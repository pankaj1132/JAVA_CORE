package Array;

public class duplicate_element {
    public static void main(String[] args) {
        int [] arr={1,4,5,67,56,6,55,555,55,67,90};
        boolean isDuplicate=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    System.out.println("Duplicate Element is: "+arr[i]);
                    break;
                }
            }
        }
        if(isDuplicate){
            System.out.println("Duplicate Element");
        }else{
            System.out.println("No Duplicate Element");
        }
    }
    
}
