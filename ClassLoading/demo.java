package ClassLoading;

public class demo {
    static double a;
        static{
            a=10.5;
            System.out.println("static initializer "+a);
        }
        int b;
        {
            b=20;
        }
        public static void main(String arg[]){
        demo ref=new demo();
        System.out.println(ref.b);
        System.out.println((float)a);
        System.out.println(ref);
        }
}
