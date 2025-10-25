import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double loopCount = 0;
        double min = 0;
        double max = 0;

        while (true) {
            // Get the user input as the double
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number or char: ");
            String number = sc.nextLine();
            try {
                double validNumber = Double.parseDouble(number);
                if (loopCount == 0 || validNumber < min) {
                    min = validNumber;
                }

                if (loopCount == 0 || validNumber > max) {
                    max = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println(min + " " + max);
    }
}



