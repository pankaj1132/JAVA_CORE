package Relationship.aggregation2;

public class Run_Phone {
    public static void main(String[] args) {
        Phone p=new Phone("Realme",7845);
        p.insertSim(new Sim("Jio",'3'));
        p.s.call();
    }
}
