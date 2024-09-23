package Relationship.aggregation;

public class VideoPlayer {
    String brand;
    double size;

    VideoPlayer(String brand,double size){
        this.brand=brand;
        this.size=size;
    }

    public void play(){
        System.out.println("Playing Video");
    }
    public void volume_up(){
        System.out.println("Volumn is increasing");
    }
}
