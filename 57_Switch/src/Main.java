import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;  // loop condition

        while (keepGoing) {
            // Prompt user for input
            System.out.print("Enter your number 1: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter your number 2: ");
            double number2 = scanner.nextDouble();

            double result = 0; // variable for storing calculation result
            boolean validOperation = true;

            // Perform calculation
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = number1 / number2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    validOperation = false;
            }

            // Display result if valid
            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Ask user to continue
            System.out.print("Perform another calculation? (y/n): ");
            String choice = scanner.next().toLowerCase();
            if (choice.equals("n")) {
                keepGoing = false;
                System.out.println("Thanks!");
            }
        }

        scanner.close();
    }
}
