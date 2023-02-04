package AbstractClasses_34;

import java.util.ArrayList;

public class Main {

    private static void doAnimalStuff(Animal animal) {
        animal.movingSpeed();
        animal.makeNoise();
    }

    public static void main(String[] args) {
        // Animal is an abstract class, can not be instantiated
        // Animal animal = new Animal("animal", "big", 100);

        Dog dog1 = new Dog("Chihuahua", "little", 30);
/*        dog1.makeNoise();
        doAnimalStuff(dog1);*/

        Dog dog2 = new Dog("German Shepherd", "big", 70);
        Dog dog3 = new Dog("Boston Terrier", "medium", 48);
        Fish fish1 = new Fish("Common carp", "medium", 14);
        Fish fish2 = new Fish("Great white shark", "big", 76);
        Fish fish3 = new Fish("Mickey Mouse Platy", "little", 0.005);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(fish1);
        animals.add(fish2);
        animals.add(fish3);

        System.out.println("My list contains " + animals);

        for(Animal a : animals) {
            System.out.println("_".repeat(30));
            doAnimalStuff(a);
        }

        dog1.getExplicitType();
        fish1.getExplicitType();

        System.out.println("_". repeat(30));
        Horse horse = new Horse("Arabian horse", "big", 450);
        horse.movingSpeed();
        horse.makeNoise();
    }
}