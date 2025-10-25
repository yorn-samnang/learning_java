public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jame", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Nang", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Look", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(" "+ playerName + " manage to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playScore) {

        // A lot of "return" make us confuse
//        if (playScore >= 1000) {
//            return 1;
//        } else if (playScore >= 500) {
//            return 2;
//        }  else if (playScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
        int position = 0;
        if (playScore >= 1000) {
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        }  else if (playScore >= 100) {
            position = 3;
        } else {
            position =  4;
        } return position;
    }
}
