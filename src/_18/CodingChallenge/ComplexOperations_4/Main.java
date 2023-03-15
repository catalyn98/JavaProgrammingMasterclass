package _18.CodingChallenge.ComplexOperations_4;

public class Main {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        ComplexNumber number = new ComplexNumber(10, 10);
        one.add(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
    }
}