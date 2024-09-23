package Inheritence;

public class animal {
    String color;
    private int size;
    public  void eats(){
        System.out.println("All Animal Eats");
    }

    public void huge(int size){
        this.size=size;
        System.out.println("Size of animal is  "+this.size);
    }
}
