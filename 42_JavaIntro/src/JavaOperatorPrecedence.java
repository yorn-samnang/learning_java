public class JavaOperatorPrecedence {
    public static void main(String[] args) {
        // create variables
        double myFirstDoubleValue = 20.00d, mySecondDoubleValue = 80.00d;

        // compute values
        double result = 100.00d * (myFirstDoubleValue + mySecondDoubleValue);
        double remainder = result % 40.00d;

        // check if it is true
        boolean isZeroRemainder = (remainder == 0);

        // create message variable with ternary operator
        String message = isZeroRemainder ? "The remainder is zero!" : "Got some remainder!";

        // display the outputs
        System.out.println("Result: " + result);
        System.out.println("Message: " + message);
    }
}
