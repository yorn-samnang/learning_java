public class Main {
    public static void main(String[] args) {
        stringMethods();
    }

    public static void stringMethods() {

        String str = ")Hello World!";

        // length
        int length = str.length();

        // get the first char
        char ch = str.charAt(0);

        // get the last char
        char lastCh = str.charAt(length - 1);

        // get the index l
        int firstL = str.indexOf('l');
        int lastL = str.lastIndexOf('l');

        int secondL = str.indexOf('l', firstL + 1);


        System.out.printf("Length: %d%n", length);
        System.out.printf("First Character: %c%n", ch);
        System.out.printf("Last Character: %c%n", lastCh);
        System.out.printf("First index of 'l': %d%n", firstL);
        System.out.printf("Last index of 'l': %d%n", lastL);
        System.out.printf("Second index of 'l': %d%n", secondL);
    }
}
