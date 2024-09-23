package Relationship.aggregation;

public class Car_driver {
    public static void main(String[] args) {
        Car c=new Car("Toyota",500000);
        c.test_volumn(new VideoPlayer("MX Player",45.158));
        c.v.volume_up();
        System.out.println(c.v.brand);
        System.out.println(c.brand);
    }
}
