public class Point {
    // Instance variables
    private int x;
    private int y;

    // No-arg constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance to (0,0)
    public double distance() {
        return distance(0, 0);
    }

    // Distance to another Point
    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    // Distance to (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
}
