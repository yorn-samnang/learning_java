import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // create Scanner class object
        Scanner scn = new Scanner(System.in);
        // enter the input
        System.out.print("Enter num1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scn.nextInt();
        // ask user which operation they want
        System.out.println("Enter the operation (+, -, *, /): ");
        String operationChoice = scn.next();

        /* Traditonal Switch */
//        switch (operationChoice) {
//            case "+":
//                System.out.println("Plus Operation " + (num1 + num2));
//                break;
//            case "-":
//                System.out.println("Minus Operation "  + (num1 - num2));
//                break;
//            case "*":
//                System.out.println("Multiplication Operation "  + (num1 * num2));
//                break;
//            case "/":
//                System.out.println("Division Operation "  + (num1 / num2));
//                break;
//            default:
//                System.out.println("Invalid Choice!");
//        }

        /* Enhanced Switch */
        switch (operationChoice) {
            case "+" -> System.out.println("Plus Operation " + (num1 + num2));
            case "-" -> System.out.println("Minus Operation " + (num1 - num2));
            case "*" -> System.out.println("Multiplication Operation " + (num1 * num2));
            case "/" -> System.out.println("Division Operation " + (num1 / num2));
            default -> System.out.println("Invalid Choice!");
        }
    }
}
