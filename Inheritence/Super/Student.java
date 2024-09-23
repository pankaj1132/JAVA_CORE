package Inheritence.Super;

public class Student {
    String name;
    int rollNo;
    static{
        System.out.println("Static block in Student");
    }
    {
        System.out.println("Instance block in Student");
    }
    public void study() {
        System.out.println("Student is studying");
    }

}
