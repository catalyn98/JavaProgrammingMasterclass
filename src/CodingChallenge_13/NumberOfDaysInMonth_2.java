package CodingChallenge_13;

public class NumberOfDaysInMonth_2 {

    public static boolean isLeapYear(int year) {
        if((year < 1) || (year > 9999) )
            return false;
        else if((year % 4 == 0) && (year % 100 != 0))
            return true;
        else return (year % 100 == 0) && (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int var1 = 31;
        int var2 = 30;
        int var3 = 29;
        int var4 = 28;
        if ((month < 1) || (month > 12))
            return -1;
        else if ((year < 1) || (year > 9999))
            return -1;
        else
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return var1;
                }
                case 4, 6, 9, 11 -> {
                    return var2;
                }
                case 2 -> {
                    if (isLeapYear(year))
                        return var3;
                    else
                        return var4;
                }
            }
        return 0;
    }
}
