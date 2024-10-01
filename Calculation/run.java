package Calculation;

public class run {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        CalculatorUI calculatorUI = new CalculatorUI(calculator);
        calculatorUI.run();
    }
    
}
