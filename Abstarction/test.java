package Abstarction;

public  interface  test {
    int a = 10;
    abstract  void display();    // Abstract method in interface non  static always public
    public static void t1(){                        // Static method in interface concrete method 
        System.out.println("Static method in interface");
    }

   
    default void t2(){                        // Default method in interface concrete method or non static
        System.out.println("Default method in interface");
    }
    
    private void t3(){                        // Private method in interface concrete method or non static
        System.out.println("Private method in interface");
    }
}
