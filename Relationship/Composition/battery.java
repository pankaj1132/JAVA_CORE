package Relationship.Composition;

public class battery {
    String brand;
    int power;

    battery(String brand,int power){
        this.brand=brand;
        this.power=power;
    }
    public void oncharge(){
        System.out.println("Charging....");

    }
    public void discharge(){
        System.out.println("discharging....");
    }
}
