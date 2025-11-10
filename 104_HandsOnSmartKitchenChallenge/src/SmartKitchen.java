public class SmartKitchen {
    // instance variables

    // If an object contains the other object and
    // the contained object cannot exist without the existence of that object,
    // then it is called composition.

    // A SmartKitchen has a CoffeeMaker, DishWasher, and Refrigerator.

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker(false);
        this.dishWasher = new DishWasher(false);
        this.refrigerator = new Refrigerator(false);
    }

    public void addWater() {
        System.out.println("Adding water to the coffee maker.");
    }

    public void pourMilk(double percentExtra) {
        System.out.println("Adding milk to the coffee maker.");
        coffeeMaker.addMilk(percentExtra);
    }

    public void loadDishwasher() {
        System.out.println("Loading the dishwasher with dirty dishes.");
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishFlag, boolean fridgeFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();
    }

    public CoffeeMaker getCoffeeMaker() { return coffeeMaker; }
    public DishWasher getDishWasher() { return dishWasher; }
    public Refrigerator getRefrigerator() { return refrigerator; }
}

// Refrigerator class
class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food from the supermarket.");
            hasWorkToDo = false;
        } else {
            System.out.println("No need to order food.");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

// CoffeeMaker class
class CoffeeMaker {
    private boolean hasWorkToDo;
    private double milkLevel;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        this.milkLevel = 1.0; // default 100%
    }

    public void addMilk(double percentExtra) {
        milkLevel += milkLevel * (percentExtra / 100);
        if (percentExtra < 0.0) {
            System.out.printf("Decreased %.0f%% milk. Total milk level: %.2f%%%n", percentExtra, milkLevel * 100);
        } else {
            System.out.printf("Added %.0f%% extra milk. Total milk level: %.2f%%%n", percentExtra, milkLevel * 100);
        }

    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing a fresh cup of coffee.");
            hasWorkToDo = false;
        } else {
            System.out.println("Coffee is already brewed.");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

// DishWasher class
class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes have been washed.");
            hasWorkToDo = false;
        } else {
            System.out.println("No dishes to wash.");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
