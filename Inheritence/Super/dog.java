package Inheritence.Super;

public class dog extends Animal {
    dog(String breed) {
        super(breed);
        System.out.println("Dog is created");
    }
    public static void main(String[] args) {
        dog d = new dog("pug");
        d.eat();
    }
}
