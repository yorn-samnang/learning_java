public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("Husky", "Medium", 45.0, "Pointy", "Long");
        doAnimalStuff(dog, "fast");

        Animal animal2 = new Animal();
        doAnimalStuff(animal2, "moderate");

        Fish fish = new Fish("Goldfish", "Small", 0.5, 6, 2);
        doAnimalStuff(fish, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____________");
    }
}
