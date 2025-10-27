import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Song titles
        ArrayList<String> songTitles = new ArrayList<>();
        songTitles.add("1. Perfect - Ed Sheeran");
        songTitles.add("2. Shape of You - Ed Sheeran");
        songTitles.add("3. Let It Be - The Beatles");
        songTitles.add("4. See You Again - Wiz Khalifa");
        songTitles.add("5. Believer - Imagine Dragons");
        songTitles.add("6. Someone Like You - Adele");
        songTitles.add("7. Counting Stars - OneRepublic");
        songTitles.add("8. Memories - Maroon 5");
        songTitles.add("9. Demons - Imagine Dragons");
        songTitles.add("10. Love Story - Taylor Swift");

        // 2️⃣ Lyrics (simple examples)
        ArrayList<String[]> lyrics = new ArrayList<>();
        lyrics.add(new String[]{
                "I found a love, for me",
                "Darling just dive right in, and follow my lead",
                "Well I found a girl, beautiful and sweet",
                "🎶 Music playing... 🎶"
        });
        lyrics.add(new String[]{
                "The club isn't the best place to find a lover",
                "So the bar is where I go",
                "Me and my friends at the table doing shots",
                "🎵 Tap tap boom 🎵"
        });
        lyrics.add(new String[]{
                "When I find myself in times of trouble",
                "Mother Mary comes to me",
                "Speaking words of wisdom, let it be"
        });
        lyrics.add(new String[]{
                "It's been a long day without you my friend",
                "And I'll tell you all about it when I see you again"
        });
        lyrics.add(new String[]{
                "First things first, I'ma say all the words inside my head",
                "I'm fired up and tired of the way that things have been"
        });
        lyrics.add(new String[]{
                "Never mind, I'll find someone like you",
                "I wish nothing but the best for you too"
        });
        lyrics.add(new String[]{
                "Lately, I've been, I've been losing sleep",
                "Dreaming about the things that we could be"
        });
        lyrics.add(new String[]{
                "Here's to the ones that we got",
                "Cheers to the wish you were here, but you're not"
        });
        lyrics.add(new String[]{
                "When the days are cold and the cards all fold",
                "And the saints we see are all made of gold"
        });
        lyrics.add(new String[]{
                "We were both young when I first saw you",
                "I close my eyes and the flashback starts"
        });

        // 3️⃣ Show menu
        System.out.println("🎤 Welcome to Java Karaoke Console!");
        System.out.println("Choose a song to sing:");
        for (String title : songTitles) {
            System.out.println(title);
        }

        System.out.print("\nEnter song number (1-10): ");
        int choice = input.nextInt();

        if (choice < 1 || choice > 10) {
            System.out.println("❌ Invalid choice. Please restart the program.");
        } else {
            System.out.println("\nPlaying: " + songTitles.get(choice - 1));
            System.out.println("-----------------------------------");
            Thread.sleep(1000);

            // 4️⃣ Print lyrics line by line
            for (String line : lyrics.get(choice - 1)) {
                System.out.println(line);
                Thread.sleep(1500); // delay for karaoke effect
            }

            System.out.println("-----------------------------------");
            System.out.println("🎶 End of song! 🎶");
        }

        input.close();
    }
}

