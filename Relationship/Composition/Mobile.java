package Relationship.Composition;

public class Mobile
{
    String brand;
    int model_no;
    battery b;
    {
        b=new battery("nokia",25);
    }

    Mobile(String brand, int model_no) {
        this.brand=brand;
        this.model_no=model_no;
    }
    
    public void play(){
        System.out.println("Playing music");
    }
    public void call(){
        System.out.println("calling ....");
    }
}
