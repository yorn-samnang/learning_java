public class Fish extends Animal {
    // instance field
    private int fins; // ព្រុយត្រី
    private int gills; // ស្រការត្រី

    public Fish(String type, String size, double weight, int fins, int gills) {
        super(type, size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveBackFin();
        moveMuscles();
    }

    private void moveMuscles() {
        System.out.println("The fish is moving its muscles");
    }

    private void moveBackFin() {
        System.out.println("The fish is moving its back fin");
    }
}
