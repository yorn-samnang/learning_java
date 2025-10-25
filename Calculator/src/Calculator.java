import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in); // only one Scanner

        while (!quit) {
            displayCalculatorMenu();
            char operation = getOperation(scanner); // pass Scanner

            // Validate operation
            while (operation != '1' && operation != '2' && operation != '3' && operation != '4'
                    && operation != '+' && operation != '-' && operation != '*' && operation != '/'
                    && operation != 'q' && operation != 'Q') {
                System.out.println("Invalid choice. Please select a valid operation.");
                operation = getOperation(scanner);
            }

            if (operation == 'q' || operation == 'Q') {
                System.out.println("Thank you for using the calculator. Goodbye!");
                quit = true;
            } else {
                double num1 = getNumbers(scanner, "Enter the first number: ");
                double num2 = getNumbers(scanner, "Enter the second number: ");

                if (operation == '/' || operation == '4') {
                    while (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        num2 = getNumbers(scanner, "Please enter a non-zero second number: ");
                    }
                }

                double result = calculateResult(num1, num2, operation);
                displayResult(result);

                System.out.println("\nDo you want to continue? (y/n): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    quit = true;
                }
            }
        }

        scanner.close(); // close Scanner at the end
    }

    public static void displayCalculatorMenu() {
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Quit (q)");
    }

    public static double getNumbers(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next(); // discard invalid input
        }
        return scanner.nextDouble();
    }

    public static char getOperation(Scanner scanner) {
        System.out.print("Enter your choice (1, 2, 3, 4, or q to quit): ");
        String input = scanner.next();
        return input.charAt(0);
    }

    public static double calculateResult(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
            case '1':
                return num1 + num2;
            case '-':
            case '2':
                return num1 - num2;
            case '*':
            case '3':
                return num1 * num2;
            case '/':
            case '4':
                return num1 / num2;
            default:
                return 0; // won't happen due to validation
        }
    }

    public static void displayResult(double result) {
        System.out.printf("Result: %.2f\n", result);
    }
}
