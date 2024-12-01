package Week9.problemă_propusă_rezolvare_ex2;

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
