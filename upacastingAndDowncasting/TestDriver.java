package upacastingAndDowncasting;



public class TestDriver {
    public static void main(String[] args) {
        Animal a= new Monkey();
        System.out.println(a.breed);
        a.sound(); //upcasting.......



        Monkey m =(Monkey)a;
        System.out.println("accesing member's with the help og child");
        System.out.println(m.breed);
        m.sound();
        m.highJump();
//downcasting.......
        
    }
    
}
