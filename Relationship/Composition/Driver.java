package Relationship.Composition;

public class Driver {
    public static void main(String[] args) {
        Mobile m = new Mobile("MI", 451);
        m.b.oncharge();
        m.play();
        m.b.discharge();
        m.call();
        System.out.println(m.brand);

    }
}
