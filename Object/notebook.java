package Object;

public class notebook {
    String brand ;
    int pages;
    int price;
    public notebook(String brand, int pages, int price) {
        this.brand = brand;
        this.pages = pages;
        this.price = price;
    }


    @Override
    public boolean equals(Object o){
        notebook n3 = (notebook)o;
        return this.brand==n3.brand && this.pages==n3.pages && this.price==n3.price;
    }
       
    
}
