package Inheritence;

public class cat extends animal {
    String breed;
    public void getters(){
        System.out.println(breed);
    }
    public void setters(String breed){
        this.breed=breed;
    }
    public static void main(String[] args) {
        cat c=new cat();
        c.eats();
        c.huge(452);
        c.setters("Persion");
        c.getters();

    }
}
