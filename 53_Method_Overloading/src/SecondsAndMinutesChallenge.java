public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(100));
        System.out.println(getDurationString(197, 0));
    }
    public static String getDurationString(int seconds) {
        if  (seconds <= 0) {
            return "Invalid value!";
        }
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
    };

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value!";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);

    }
}
