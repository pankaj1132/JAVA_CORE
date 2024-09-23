package Relationship.aggregation2;

public class Phone {
    String brand;
    int model_no;
    Sim s;

    Phone(String brand, int model_no) {
        this.brand=brand;
        this.model_no=model_no;
    }
    
    public void play(){
        System.out.println("Playing music");
    }

    public void insertSim(Sim s){
        this.s=s;
    }
}
