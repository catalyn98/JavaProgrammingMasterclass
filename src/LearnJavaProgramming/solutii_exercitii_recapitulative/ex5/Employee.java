package LearnJavaProgramming.solutii_exercitii_recapitulative.ex5;

// Clasa abstractă Employee
public abstract class Employee implements Payable {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public Employee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Implementare metodă din interfața Payable
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + "]";
    }
}
