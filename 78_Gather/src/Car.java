public class Car {

    private String make = "Telsa";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Stage 1: We can access only this method inside Main.java b
    // but I want to access elements above, how can I do then????
    // what you can do is to use Getter method(Return the values
    // from the private field)

    // @ Create the Getter Method
    public String  getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // @ Create the Setter Method
    public void setMake(String make) {
        this.make = make;
        if (make == null) {
            make = "Unknown";
        }

        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake) {
            case "Teslas", "Pruis", "Jeep" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
