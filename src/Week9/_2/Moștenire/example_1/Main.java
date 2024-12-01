package Week9._2.Moștenire.example_1;

//Code wrote by Catalan Catalin

// Testarea moștenirii
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();  // Metodă moștenită
        dog.bark(); // Metodă specifică clasei Dog

        cat.eat(); // Metodă moștenită
        cat.meow(); // Metodă specifică clasei Cat
    }
}
