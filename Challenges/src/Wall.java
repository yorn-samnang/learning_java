public class Wall {
    // write code here
    private double width;
    private double height;

    // No-args constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // constructor with parameters
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        } // Sets the value of Width
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        } // Sets the value of height
    }

    public double getArea() {
        return width * height;
    }

}