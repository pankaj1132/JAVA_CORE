package Array;

public class duplicate_element {
    public static void main(String[] args) {
        int [] arr={1,4,5,67,56,6,55,555,55,67,90,67};
      
       
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j < arr.length; j++ ) {
                if(arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE) {
                 count=1;
                 arr[j]=Integer.MIN_VALUE;
                   
                
                }
                
            }
            if(count==1){
                System.out.println(arr[i]);
            }
           
        
            
        }
      
    }
    
}
