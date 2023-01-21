package SwitchStatement_12;

public class SwitchStatement {

    public static String switchValueMethod(int switchValue) {
        return switch (switchValue) {
            case 1 -> "unu";
            case 2 -> "doi";
            default -> {
                yield "default";
            }
        };
    }

    public static void NATOAlphabet(char letter) {
        switch (letter) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            default -> System.out.println("Unexpected value: " + letter);
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String s = "Invalid Day";
                yield s;
            }
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
