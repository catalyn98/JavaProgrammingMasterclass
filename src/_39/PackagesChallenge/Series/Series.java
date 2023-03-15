package _39.PackagesChallenge.Series;

public class Series {

    public static void nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
            System.out.println("The sum of the first " + i + " numbers is " + sum);
        }
    }

    public static void factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            System.out.println("The first " + i + " factorials are " + factorial);
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("The first " + i + " fibonacci numbers are " + fibonacci(i));
        }
    }
}
