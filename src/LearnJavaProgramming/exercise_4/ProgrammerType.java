package LearnJavaProgramming.exercise_4;

import java.util.Scanner;

public class ProgrammerType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numărul de ore pe care îl dedici zilnic programării: ");
        int hours = scanner.nextInt();

        if (hours < 2) {
            System.out.println("Ești un Programator Junior.");
        } else if (hours >= 3 && hours <= 5) {
            System.out.println("Ești un Programator Mid.");
        } else if (hours > 6 && hours <= 8) {
            System.out.println("Ești un Programator Senior.");
        } else {
            System.out.println("Valoarea introdusă nu se află în nici un interval.");
        }

        scanner.close();
    }
}
