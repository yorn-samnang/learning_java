public class Main {
    public static void main(String[] args) {
        double budget = 200.00d;

        String iPhone = "iPhone";
        String Samsung = "Samsung";
        String Oppo = "Oppo";

        if (budget >= 1000.00d && budget <= 2000.00d) {
            System.out.println("You can buy " + iPhone);
        } else if (budget <= 500.00d && budget >= 200.00d) {
            System.out.println("You can buy " + Samsung);
        } else {
            System.out.println("You can buy " + Oppo);
        }
    }
}