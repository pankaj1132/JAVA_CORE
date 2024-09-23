class calculator {
    public static void main(String arg[]) {
        int a = 9, b = 3;
        char ch = '/';
        switch (ch) {
            case '+':
                System.out.println("Addition of two numbers is: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is: " + (a * b));
            case '/':
                System.out.println("Division of two numbers is: " + (a / b));
                break;
            case '%':
                System.out.println("Modulus of two numbers is: " + (a % b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
