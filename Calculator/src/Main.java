public class Main {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Loop through rows
        for (int row = 1; row <= number; row++) {
            // Loop through columns
            for (int col = 1; col <= number; col++) {
                // 4 conditions for printing a star
                if (row == 1 || row == number || col == 1 || col == number
                        || row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}
