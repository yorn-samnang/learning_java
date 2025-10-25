import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The total is: " + getUserInput());
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Enter number " + i + ": ");
                try {
                    int number = sc.nextInt();
                    sum += number;
                    valid = true; // exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input! Please enter an integer.");
                    sc.nextLine(); // clear the bad input
                }
            }
        }
        return sum;
    }
}
