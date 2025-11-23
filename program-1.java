import java.util.Scanner;

class Calculator {
    double a;
    double b;
    String type_of_operation;

    Calculator(double a, double b, String type_of_operation) {
        this.a = a;
        this.b = b;
        this.type_of_operation = type_of_operation.toLowerCase();
    }

    double calculate() {
        switch (type_of_operation) {
            case "add":
                return a + b;

            case "sub":
                return a - b;

            case "mul":
                return a * b;

            case "div":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);
        double result = calc.calculate();

        System.out.println("Result: " + result);
    }
}
