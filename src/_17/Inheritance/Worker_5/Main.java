package _17.Inheritance.Worker_5;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Catalan David", "02/11/1998", "20/09/2021");
        System.out.println(employee);
        System.out.println(employee.getAge());
        System.out.println(employee.collectPay());

        SalariedEmployee salariedEmployee = new SalariedEmployee("Pater Sorin", "02/12/1979", "20/09/2021", 35000);
        System.out.println(salariedEmployee);
        System.out.println(salariedEmployee.getAge());
        System.out.println(salariedEmployee.collectPay());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Victoria Justice", "01/06/1990", "20/09/2020", 50);
        System.out.println("Hourly employee - collect pay: " + hourlyEmployee.collectPay());
        System.out.println("Hourly employee - get double pay: " + hourlyEmployee.getDoublePay());
        System.out.println(hourlyEmployee);
    }
}