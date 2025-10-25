import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        double counter = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter a number (or non-number to quit): ");
            String input = sc.nextLine();

            try {
                double validNum = Double.parseDouble(input);
                sum += validNum;
                counter++;
            } catch (NumberFormatException e) {
                // Stop input when a non-number is entered
                break;
            }
        }

        double avg = (counter > 0) ? sum / counter : 0;
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
