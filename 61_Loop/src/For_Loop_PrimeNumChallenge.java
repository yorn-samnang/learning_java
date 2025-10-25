public class For_Loop_PrimeNumChallenge {
    public static void main(String[] args) {
//        System.out.println(isPrime(2));
        int primeCounter;
        for (primeCounter = 1; primeCounter <= 100; primeCounter++) {
            if (isPrime(primeCounter)) {
//                if (primeCounter == 3)
//                    break;
                System.out.println(primeCounter);
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            };
        }
        return true;
    }
}
