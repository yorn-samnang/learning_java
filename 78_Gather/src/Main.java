public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        // Print the value from the Setter Method
        car.setMake("Lexus");
        car.setModel("2025");
        car.setColor("red");
        car.setDoors(5);


        // Returning the value from Getter Method
        System.out.println("Make = " + car.getMake());

        car.describeCar();
    }
}
