 package Calculation;
 // Concrete class BasicCalculator
public class BasicCalculator extends Calculator {
    
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

   
    public double divide(double num1, double num2) {
        if (num2 == 0) {
           System.out.println("Error! Dividing by zero is not allowed.");
        }
        return num1 / num2;
    }
}