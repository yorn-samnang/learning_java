public class Main {
//    String Builder Module
//
//    What is StringBuilder in Java?
//
//    ** Strings in Java are immutable, meaning: Every time you change a string,
//    Java creates a new one in memory.
//
//    HOWEVER,

//    ** StringBuilder is mutable that allows us to modify strings efficiently
//    especially when u change text for many times.
//
//    Common Methods
//
//1. append("text") Add text at the end
//
//2. insert(0, "Hi") Insert text at index
//
//3. replace(0, 5, "Hey") Replace part of text
//
//4. delete(0, 3) Remove part of text
//
//5. reverse() Reverse the string
//
//6. toString() Convert to a normal String

    public static void main(String[] args) {
        stringBuilderMethods();
    }

    public static void stringBuilderMethods() {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // append
//        sb.append(" World!");
//        System.out.printf("After append: %s%n", sb.toString());

        // insert
//        sb.insert(0, "Say: ");
//        System.out.printf("After insert: %s%n", sb.toString());

        // replace
        sb.replace(0, 4, "Speak:"); // exclude the end index
        System.out.printf("After replace: %s%n", sb.toString());

        // delete
        sb.delete(0, 6);
        System.out.printf("After delete: %s%n", sb.toString());

        // reverse
        sb.reverse();
        System.out.printf("After reverse: %s%n", sb.toString());

        // toString
        String finalString = sb.toString();
        System.out.printf("Final String: %s%n", finalString);
    }
}
