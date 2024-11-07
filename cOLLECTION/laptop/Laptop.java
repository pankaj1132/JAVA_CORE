package cOLLECTION.laptop;

public class Laptop {
    String brand ;
    int price;
    int Quantity;    
    public Laptop(String brand, int price, int Quantity) {
        this.brand = brand;
        this.price = price;
        this.Quantity = Quantity;
    }


public String toString(){
    return brand + " " + price + " " + Quantity;
    
}
}
