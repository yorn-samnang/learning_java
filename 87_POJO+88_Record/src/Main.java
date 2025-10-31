public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student student = new Student("S001" + i,
                    switch (i) {
                        case 1 -> "Alice";
                        case 2 -> "Bob";
                        case 3 -> "Charlie";
                        case 4 -> "Diana";
                        case 5 -> "Ethan";
                        default -> "Unknown";
                    },
                    "2000-01-01",
                    "Math, Science");
            System.out.println(student);
        }
    }
}
