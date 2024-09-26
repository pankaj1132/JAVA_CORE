package upacastingAndDowncasting;

public class marutiDriver {
    public static void main(String[] args) {
        // Maruti m1 = new Maruti();
        // MarutiSwift m = (MarutiSwift) m1;     ||| classCast Exctption 

        // System.out.println(m1 instanceof MarutiSwift);   false 


    Maruti m1 = new MarutiSwift();
    MarutiSwift m = (MarutiSwift) m1; 
    System.out.println(m1 instanceof MarutiSwift); //true 



    // when there is no is-a relationship in two class and we use instanceof operator then we will get compile time error

    }
    
}
