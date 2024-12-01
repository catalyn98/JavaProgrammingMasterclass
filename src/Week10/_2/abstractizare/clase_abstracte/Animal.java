package Week10._2.abstractizare.clase_abstracte;

public abstract class Animal {
    abstract void makeSound(); // Metodă abstractă: fără corp

    void sleep() {             // Metodă concretă: cu corp
        System.out.println("Animalul doarme.");
    }
}