package _13.CodingChallenge;

public class PerfectNumber_11 {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        if (number < 1)
            return false;
        else
            for(int i = 1; i < number; i++) {
                if(number % i == 0)
                    sum = sum + i;
                if(sum == number)
                    return true;
            }
        return false;
    }
}
