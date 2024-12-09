package LearnJavaProgramming.solutii_exercitii_recapitulative.ex5;

// Clasa Manager
public class Manager extends Employee {
    private double monthlySalary;

    // Constructor
    public Manager(String name, double monthlySalary) {
        super(name, 0, 0); // Managerul nu folosește orele lucrate sau rata orară
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary; // Salariu fix
    }
}
