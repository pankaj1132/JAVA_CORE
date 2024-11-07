package cOLLECTION.laptop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class laptopCollection {
    public static void main(String[] args) {
        Collection<Laptop> c = new ArrayList<Laptop>();
        c.add(new Laptop("Dell", 50000, 10));
        c.add(new Laptop("HP", 40000, 20));
        c.add(new Laptop("Lenovo", 50000, 30));
        c.add(new Laptop("Apple", 80000, 40));
        c.add(new Laptop("Asus", 20000, 50));
        c.add(new Laptop("Acer", 100000, 60));



        Iterator<Laptop> i = c.iterator();
        while(i.hasNext()){
            Laptop l = i.next();


            if(l.price<50000){
                System.out.println(l.brand);
            }
            else{
                l.Quantity = l.Quantity+1;
               System.out.println( l.Quantity);

             System.out.println(l);
            }
            
        }

        
    }
    
}
