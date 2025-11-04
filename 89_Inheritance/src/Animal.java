public class Animal { // Superclass (Parent)
    // instance variables
    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // no argument constructor
    // If no constructors are explicitly defined within a class,
    // the Java compiler automatically provides a default no-arg constructor.
    public Animal() {
        this.type = "unknown";
        this.size = "unknown";
        this.weight = 0.0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
