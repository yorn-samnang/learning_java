public class Main {
    public static void main(String[] args) {
        // create the bedroom instance

        // Create 4 Wall objects
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        // Create a Ceiling object
        Ceiling ceiling = new Ceiling(12, 55);

        // Create a Bed object
        Bed bed = new Bed("Modern", 4, 3, 2, 1);


        // Create a Lamp object
        Lamp lamp = new Lamp("Classic", false, 75);

        // Create the Bedroom object and pass all the components to it
        Bedroom bedroom = new Bedroom("Nang's Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        // use the bedroom instance
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        System.out.println(bedroom.getLamp());
        System.out.println(bedroom);
    }
}
