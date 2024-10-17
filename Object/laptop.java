package Object;

public class laptop {
    String brand;
    int ram;
    public laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    @Override
    public String toString() {
        System.out.println("Brand: "+brand+" // Ram: "+ram);
        return "";
        
    }


    
}
