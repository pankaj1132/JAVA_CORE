package ConstructorChaining;

public class Test {
    double d;

    Test() {
        System.out.println("India is a ");
    }
    Test(char d) {
        this();
        System.out.println("great ");
    }
    Test(char d, int b) {
        this('a');
        this.d = d;
        System.out.println("country ");
    }
    public static void main(String[] args) {
        Test t = new Test('a', 10);
        System.out.println(t.d);
    }
    
}
