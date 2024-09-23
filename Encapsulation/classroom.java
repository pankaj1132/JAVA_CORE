package Encapsulation;

public class classroom {
    private int no_of_chair=35;
    private int no_of_board=20;
    public void set_chair(int a){
        if(this.no_of_chair-a<0){
            return;
        }
        else{
            this.no_of_chair=a;
        }
    }
    public void set_board(int b){
        if(b>0){
            this.no_of_board=b;
        }
        else{
            System.out.println("Invalid output");
        }
    }
    public int get_board(){
        return no_of_board;
    }
    public int get_chair(){
        return no_of_chair;
    }

    public static void main(String arg[]){
    classroom cr=new classroom();
    System.out.println("Before updating : "+cr.get_board());
    cr.set_board(cr.get_board()-10);
    System.out.println("after updating : "+cr.get_board());
    }
}