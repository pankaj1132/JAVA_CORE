package Object;
/**
 * notebooktest
 */
public class notebooktest {

    public static void main(String[] args) {
        
        notebook n1= new notebook("classmate", 233, 90);
        notebook n2=new notebook("classmate", 233, 90);


        System.out.println(n1.equals(n2));
    }
}