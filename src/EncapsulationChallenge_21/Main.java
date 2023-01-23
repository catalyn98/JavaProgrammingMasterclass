package EncapsulationChallenge_21;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer(30, false);
        Printer printer2 = new Printer(50, true);

        System.out.println("First printer has " + printer1.addToner(80) + "% of toner");
        System.out.println("First printer has " + printer2.addToner(40) + "% of toner");
        printer1.printPages(30);
        printer2.printPages(40);
    }
}