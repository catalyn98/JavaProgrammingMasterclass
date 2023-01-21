package CodingChallenge_13;

public class SharedDigit_7 {

    public static boolean hasSharedDigit (int p, int q)
    {
        if (!(p > 10 && q <= 99 && p <= 99 && q > 10))
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
}
