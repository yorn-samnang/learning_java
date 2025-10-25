import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            getUserInput();
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
        }

    }
    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what is your name? ");
        String name = sc.nextLine();
        System.out.println("What is your age? ");
        int age = sc.nextInt();

        System.out.println("Hi, "+ name +", thank you for taking this course!" + age);
    }
}
