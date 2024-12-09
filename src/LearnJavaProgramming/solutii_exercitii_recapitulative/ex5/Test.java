package LearnJavaProgramming.solutii_exercitii_recapitulative.ex5;

// Clasa Test
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Listă de angajați
        List<Employee> employees = new ArrayList<>();

        // Adăugare angajați
        employees.add(new Developer("Alice", 160, 25, 3)); // 3 proiecte
        employees.add(new Manager("Bob", 4000)); // Salariu fix
        employees.add(new Developer("Charlie", 120, 30, 2)); // 2 proiecte

        // Calculul și afișarea salariilor
        double totalPay = 0;
        System.out.println("Salarii angajați:");
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("- " + employee.getName() + ": " + pay);
            totalPay += pay;
        }

        // Afișare total
        System.out.println("Total salarii: " + totalPay);
    }
}
