public class Dog extends Animal { // Subclass (Child) using extends keyword
    // instance variables (attributes) specific to Dog can be added here
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Husky", "Medium", 45.0);
    }
    // creating a parameterized constructor for Dog class

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}';
    }

    @Override // Override the method from the superclass
    public void move(String speed) {
        super.move(speed);
        // additional behavior specific to Dog
        System.out.println("Dog specific movement behavior");
        bark(); // calling method
        run();

    }

    private void bark() {
        System.out.println("Woof Woof");
    }

    private void run() {
        System.out.println("The dog is running");
    }

    private void eat() {
        System.out.println("The dog is eating");
    }
}

// Explanation:
//#super()
//
// In Java, the super() keyword is crucial for working with inheritance.
// Here’s why you would use super() in your Dog class constructor:
//
// Calling the Parent Class Constructor:
// When you invoke super("Husky", "Medium", 45.0);,
// you are calling the constructor of the parent class (Animal).
// This ensures that the attributes of the Animal class are initialized properly before any Dog-specific attributes are defined.
//
//public class Dog extends Animal {
//    public Dog() {
//        super("Husky", "Medium", 45.0);
//    }
//}