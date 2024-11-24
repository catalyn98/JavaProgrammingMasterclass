package LearnJavaProgramming.laborator_9.moștenire;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println("Developer is writing code in " + programmingLanguage + ".");
    }
}
