package cOLLECTION;

import java.util.ArrayList;
import java.util.Collection;

public class program3 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("physics");
        c1.add("chemistry");
        c1.add("maths");
        c1.add("biology");
        c1.add("english");
        c1.add("hindi");


        c2.add("physics");
        c2.add("chemistry");
        c2.add("maths");
        c2.add("history");
        c2.add("geography");


        System.out.println(c1.contains("physics"));
        System.out.println(c1.containsAll(c2));
        System.out.println(c1.isEmpty());

        Object[] arr = c1.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

    }
}
