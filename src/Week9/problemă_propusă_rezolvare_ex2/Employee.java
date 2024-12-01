package Week9.problemă_propusă_rezolvare_ex2;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
