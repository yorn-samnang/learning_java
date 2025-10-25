public class WhileLoopChallenge {
    public static void main(String[] args) {
        printEvenNumber(1); // test from 1
    }

//    // First time, I learn
//    public static boolean isEvenNumber(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//      // Second time, I learn
//      public static double isEvenNumber(int num) {
//        if (num % 2 == 0) {
//            return num;
//        }
//        return num;
//      }

    // 100 time, I learn
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

//    public static void printEvenNumber(int start) {
//        int num = start;
//
//        while (num <= 20) { // stop at 20
//            if (isEvenNumber(num) && num > 5) {
//                System.out.println(num);
//            }
//            num++; // update num, or else infinite loop
//        }
//    }
    public static void printEvenNumber(int num) {
        int evenCounter = 0;
        int oddCounter = 0;

        while (num <= 20) {
            num++;
            if (!isEvenNumber(num)) {
                oddCounter++;
                continue;
            }
            evenCounter++;
            System.out.println(num);
            if (evenCounter == 5) {
                break;
            }
        }
        System.out.println("Even " + evenCounter);
        System.out.println("Odd " + oddCounter);
    }
}
