package Relationship.aggregation;

public class Car {
    String brand;
    int price;
    VideoPlayer v;
    Car(String brand , int price){
        this.brand=brand;
        this.price=price;
    }
    public void test_volumn(VideoPlayer v){
        this.v=v;
    }
    public void start(){
        System.out.println("Starting....");
    }

    public void Break(){
        System.out.println("Break working");
    }
    public void accelerate(){
        System.out.println("Acceleration is getting started ");
    }
}
