public class MainChallenge {
    public static void main(String[] args) {
        double convertedToCen = ConvertToCentimeters(6);
        System.out.printf("Converted to Centimeters is %f\n", convertedToCen);

        double convertedToCen2 = ConvertToCentimeters(6, 0);
        System.out.printf("Converted to Centimeters is %f\n", convertedToCen2);
    }

    public static double ConvertToCentimeters(int heighInInches) {
        return heighInInches * 2.54;
    }

    public static double ConvertToCentimeters(int heightInFeet, int heightInInches) {
        return ((heightInFeet * 12) + heightInInches) * 2.54;
    };
}
