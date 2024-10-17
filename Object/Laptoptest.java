package Object;

public class Laptoptest {
    public static void main(String[] args) {
        laptop l1=new laptop("Dell", 16);
        // laptop l2 =new laptop("Dell", 16);/  when making new object it will create new memory location

        // laptop l2=l1; without making new object it will point to same memory location
        laptop l2=l1;
        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));
        System.out.println(l1);
        System.out.println(l1.toString());
       
        
    
    }
    
}
