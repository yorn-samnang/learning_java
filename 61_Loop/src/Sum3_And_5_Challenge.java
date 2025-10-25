public class Sum3_And_5_Challenge {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i == 5) {
                break;
            }
            if (i % 3 == 0 || i  % 5 == 0) {
                System.out.println(i);
               sum += i;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
