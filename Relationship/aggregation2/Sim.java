package Relationship.aggregation2;

public class Sim {
    String company_name;
    char network;

    Sim(String company_name,char network){
        this.company_name=company_name;
        this.network=network;
    }
    public void call(){
        System.out.println("Calling....");
    }
}
