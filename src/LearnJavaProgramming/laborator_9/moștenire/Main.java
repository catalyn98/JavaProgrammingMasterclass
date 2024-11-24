package LearnJavaProgramming.laborator_9.moștenire;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 5000, "Java");
        Manager mgr = new Manager("Bob", 7000, 10);

        // Funcționalitate comună
        dev.displayInfo();
        mgr.displayInfo();

        // Funcționalitate specifică
        dev.writeCode();
        mgr.manageTeam();
    }
}
