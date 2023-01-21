package CodingChallenge_10;

public class LeapYear_5 {

    public static boolean isLeapYear(int year) {
        if((year >= 1) && (year <= 9999)){
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            else return year % 100 == 0 && year % 400 == 0;
        } else {
            return false;
        }
    }
}
