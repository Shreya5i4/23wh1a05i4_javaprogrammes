import java.util.Scanner;

public class Calsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.print("Enter your choice (1-5): ");
        
        int operation = scanner.nextInt();
        
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Addition: " + (x + y));
                break;
            case 2:
                System.out.println("Subtraction: " + (x - y));
                break;
            case 3:
                System.out.println("Multiplication: " + (x * y));
                break;
            case 4:
                if (y != 0) {
                    System.out.println("Division: " + (x / y));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Modulo: " + (x % y));
                break;
            default:
                System.out.println("Error: Please enter a valid number (1-5).");
        }

        scanner.close();
    }
}
