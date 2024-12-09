package LearnJavaProgramming.solutii_exercitii_recapitulative.ex5;

// Clasa Developer
public class Developer extends Employee {
    private int projectsCompleted;

    // Constructor
    public Developer(String name, int hoursWorked, double hourlyRate, int projectsCompleted) {
        super(name, hoursWorked, hourlyRate);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + (projectsCompleted * 250); // Include bonusuri
    }
}

