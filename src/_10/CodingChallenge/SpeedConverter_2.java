package _10.CodingChallenge;

public class SpeedConverter_2 {

    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid value" :  toMilesPerHour(kilometersPerHour));
    }
}
