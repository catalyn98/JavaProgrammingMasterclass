package _10.CodingChallenge;

public class MinutesToYearsDaysCalculator_10 {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            double minutesInYear = 60 * 24 * 365;
            int numberOfYears = (int) (minutes / minutesInYear);
            int numberOfDays = (int) ((minutes / 60 / 24) % 365);
            System.out.println(minutes + " min = " + numberOfYears + " y and " + numberOfDays + " d");
        }
    }
}
