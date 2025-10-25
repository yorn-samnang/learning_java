public class MainChallenge {
    public static void main(String[] args) {
        int highestScore = calculateScore(true, 1000, 100, 30);
        System.out.println("The highest score is: " + highestScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        when we pass the para(s) to the method, no need to declare variables again
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 1000;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += bonus;
        }
        return finalScore;
    }
}