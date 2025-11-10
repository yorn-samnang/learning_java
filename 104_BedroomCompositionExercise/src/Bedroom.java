public class Bedroom {
    // instance fields
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    // parameterized constructor:


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // methods
    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bed -> Making | ");
        // call the bed's make() method
        bed.make();
    }

    @Override
    public String toString() {
        return "Bedroom{" + "\n" +
                "  name='" + name + '\'' + ",\n" +
                "  wall1=" + wall1 + ",\n" +
                "  wall2=" + wall2 + ",\n" +
                "  wall3=" + wall3 + ",\n" +
                "  wall4=" + wall4 + ",\n" +
                "  ceiling=" + ceiling + ",\n" +
                "  bed=" + bed + ",\n" +
                "  lamp=" + lamp + "\n" +
                '}';
    }

}

// class Lamp

class Lamp {
    // instance fields
    // An instance field is a kind of variable,
    // but with one key difference:
    // it belongs to an object (an instance) of a clas
    private String style;
    private boolean battery;
    private int globRating;

    // parameterized constructor:

    // initialize the object — that means setting up its instance variables
    // (the data it needs) when the object is first created
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // methods

    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style='" + style + '\'' +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }

}

class Bed {
    // instance fields
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // parameterized constructor:
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // methods
    public void make() {
        System.out.println("Bed -> Making bed");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }

}

class Ceiling {
    // instance fields
    private int height;
    private int paintedColor;

    // parameterized constructor:
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    // methods
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    @Override
    public String toString() {
        return "Ceiling{height=" + height + ", paintedColor=" + paintedColor + "}";
    }

}

class Wall {
    // instance fields
    private String direction;

    // parameterized constructor:
    public Wall(String direction) {
        this.direction = direction;
    }

    // methods
    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Wall{direction='" + direction + "'}";
    }

}
