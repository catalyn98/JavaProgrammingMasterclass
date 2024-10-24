package LearnJavaProgramming.exercise_10;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int result = sumOfDigits(number);
        System.out.println("Suma cifrelor numărului " + number + " este: " + result);
    }

    // Metodă recursivă pentru calcularea sumei cifrelor
    public static int sumOfDigits(int n) {
        // Condiție de oprire: dacă numărul este 0, returnează 0
        if (n == 0) {
            return 0;
        }
        // Recursie: adaugă ultima cifră la suma cifrelor rămase
        return n % 10 + sumOfDigits(n / 10);
    }
}
