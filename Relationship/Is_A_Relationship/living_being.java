package Relationship.Is_A_Relationship;

public class living_being {
    String size;
    String color;
    String name;
    String type;

    public living_being(String size, String color, String name, String type) {
        this.size = size;
        this.color = color;
        this.name = name;
        this.type = type;
    }
  
    public void display() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
    class human extends living_being {
        public human(String size, String color, String name, String type) {
            super(size, color, name, type);
        }
        int age = 20;
        public void display(){
            System.out.println("age: " + age);
        }
        public static void main(String[] args) {
            human obj2 = new human("Medium", "White", "Human", "Mammal");
            obj2.display();
            living_being obj = new living_being("Large", "Brown", "Elephant", "Mammal");
            obj.display();
            obj2.display();
        }
    }
