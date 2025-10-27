//public class RithLoveJuby {
//    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//
//        int count = 0;
//        while (count < 1_000_000) {
//            System.out.println("Hello Java!");
//            count++; // don’t print in each loop if you care about speed
//        }
//
//        long endTime = System.nanoTime();
//        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
//        System.out.printf("Duration: %.2f seconds%n", durationInSeconds);
//    }
//}

public class RithLoveJuby {

    public static void main(String[] args) {
        // Call the method inside main
        printMegaBytesAndKiloBytes(-5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = kiloBytes / 1024;
            int remainingByte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainingByte + " KB");
        }
    }
}
