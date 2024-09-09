import java.util.Scanner;

public class SimpleCalculator {

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Choose an operation
        System.out.println("================================");
        System.out.println("WELCOME TO OUR SIMPLE CALCULATOR");
        System.out.println("================================");
        System.out.println("");
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("");
        System.out.println("Operation to be use: ");
        int choice = scanner.nextInt();

        // Input first number
        System.out.println("");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("");
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("");
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
