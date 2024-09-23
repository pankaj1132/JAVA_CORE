package upacastingAndDowncasting;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Fruit f;
        Scanner sc = new Scanner(System.in);

        System.out.println("which type of fruit you want to eat ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                f = new Mango();
                System.out.println("object is created " + f);
            }

                break;

            case 2: {
                f = new Apple();
                System.out.println("object is created" + f);
            }

        }
        sc.close();

    }

}
