// Description: Remove all elements from c1 which are present in c2
//              retainAll() method is used to remove all elements from c1 which are not present in c2
//              removeAll() method is used to remove all elements from c1 which are present in c2
//              clear() method is used to remove all elements from c2
//              remove() method is used to remove a particular element from c1
//              addAll() method is used to add all elements of c2 to c1

package cOLLECTION;
import java.util.ArrayList;
import java.util.Collection;

public class program2 {
    public static void main(String[] args) {
        
        Collection c1 = new ArrayList();
        c1.add("virat");
        c1.add("dhoni");
        c1.add("sachin");
        c1.add("rohit");
        c1.add("rahul");
        c1.add("hardik");


        Collection c2 = new ArrayList();
        c2.add("virat");
        c2.add("jadeja");
        c2.add("bumrah");
        c2.add("rohit");
        c2.add("rpant");

        c1.removeAll(c2);
        // c1.retainAll(c2);
        System.out.println(c1);
        System.out.println(c2);


    }
    
}
