public class Main {
    public static void main(String[] args) {
        // Create a SmartKitchen instance
        SmartKitchen kitchen = new SmartKitchen();

        // Step 1: Set up what needs to be done
        kitchen.setKitchenState(true, true, false);
        // true = CoffeeMaker will brew coffee
        // true = DishWasher will wash dishes
        // false = Refrigerator will not order food

        // Step 2: Simulate adding ingredients
        kitchen.addWater();
        kitchen.pourMilk(-25);
        kitchen.loadDishwasher();

        // Step 3: Perform the actual work
        kitchen.doKitchenWork();

        // Step 4: Try running again — all tasks should now be done
        System.out.println("\nRunning kitchen again...");
        kitchen.doKitchenWork();
    }
}
