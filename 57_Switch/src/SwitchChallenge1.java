import java.util.Scanner;

public class SwitchChallenge1 {
    public static void main(String[] args) {
        // create the class obj
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the NATO phonetic alphabet (A-E): ");
        String natoApl = scn.nextLine();
        switch (natoApl) {
            case "A":
                System.out.println("Able");
                break;
            case "B":
                System.out.println("Baker");
                break;
            case "C":
                System.out.println("Chalie");
                break;
            case "D":
                System.out.println("Dog");
                break;
            case "E":
                System.out.println("Egg");
            default:
                System.out.println("Invalid Input.");
        }
    }
}
