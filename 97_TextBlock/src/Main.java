public class Main {
    public static void main(String[] args) {

        // Using text blocks with triple quotes
        // Java 15+ feature
        // for multi-line strings
        String textBlock = """
                This is a text block example.
                It can span multiple lines.
                Leading whitespace is preserved.
                """;

        // To indent, we need ** Escape Sequences ** like
        // \n for new line
        // \t for tab
        String textWithoutTripleQuotes = "This is a text block example.\n" +
                "It can span multiple lines.\n" +
                "Leading whitespace is preserved.";

        System.out.println(textBlock);
        System.out.println(textWithoutTripleQuotes);



        // printf example

//        Specifier	Meaning
//%s	String
//%d	Integer
//%f	Floating-point number
//%.2f	Float with 2 decimal places
//%n	New line (portable replacement for \n)

        String name = "James";
        int age = 30;

//        System.out.printf("Name: %s, %nAge: %d", name, age);

        double height = 1.73456;
        System.out.printf("Height: %.2f meters", height);

    }
}