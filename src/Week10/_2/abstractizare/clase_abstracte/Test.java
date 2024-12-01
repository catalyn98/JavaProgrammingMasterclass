package Week10._2.abstractizare.clase_abstracte;

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polimorfism
        myDog.makeSound();        // Va afișa "Câinele latră."
        myDog.sleep();            // Va afișa "Animalul doarme."
    }
}
