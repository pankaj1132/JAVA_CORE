package cOLLECTION;

import java.util.ArrayList;
import java.util.Collection;

public class program1 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add("ram");
        c1.add("shyam");
        System.out.println(c1);

        Collection c2 = new ArrayList();
        c2.add('a');
        c2.add('b');
        c2.add(1.23);
        System.out.println(c2);
        c1.addAll(c2);



        // to remove all elements of c2 from c1

        
        System.out.println(c1.remove(true)  + " " + c1);
        System.out.println(c1.removeAll(c2) + " " + c1);
        c2.clear();

    }


    
}
