package Inheritence.Super;

public class Animal {
    String breed;
    String color;
    static{
        System.out.println("Static block in Animal");
    }
    {
        System.out.println("Instance block in Animal");
    }
    Animal(String breed) {
        this.breed = breed;
        System.out.println("Animal is created");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
}
