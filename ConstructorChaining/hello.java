package ConstructorChaining;

public class hello {
    int a;
    hello(){
        this(10);
        System.out.println("Hello");
    }
    hello(int a){
        this(25,57);
        System.out.println("Hello 2nd Constructor ");
    }
    hello(int a, int b){
        this.a = a;
        System.out.println("Hello 3rd Constructor ");
    }
    public static void main(String[] args) {
        hello h = new hello();
        System.out.println(h.a);
    }
}
