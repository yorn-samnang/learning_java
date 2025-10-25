public class Digit_Sum_Challenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1));

    }
    public static int sumDigits(int num) {
        int sum = 0;
        if (num < 0) {
            return -1;
        }
        while (num != 0) {
            int last = num % 10; // get the last digit
            sum += last; // sum the last digits
            num /= 10; // remove the last digit
        }
        return sum;
    }
}
