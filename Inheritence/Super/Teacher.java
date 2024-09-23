package Inheritence.Super;

public class Teacher extends Student {
    String subject;
    static{
        System.out.println("Static block in Teacher");
    }
    {
        System.out.println("Instance block in Teacher");
    }
    public void teach() {
        System.out.println("Teacher is teaching");
    }
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.study();
        t.teach();
    }
    
}
