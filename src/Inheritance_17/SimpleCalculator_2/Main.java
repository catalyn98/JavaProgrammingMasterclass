package Inheritance_17.SimpleCalculator_2;

public class Main {

    public static void main(String[] args) {
        Inheritance_17.SimpleCalculator_2.SimpleCalculator calculator = new Inheritance_17.SimpleCalculator_2.SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
