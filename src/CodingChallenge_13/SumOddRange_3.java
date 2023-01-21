package CodingChallenge_13;

public class SumOddRange_3 {
    public static boolean isOdd(int number) {
        if(number < 0)
            return false;
        else
            return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(end < start || start < 0)
            return -1;
        for(int i = start; i <= end; i++){
            if(isOdd(i))
                sum = sum + i;
        }
        return sum;
    }
}
