package LearnJavaProgramming.solutii_exercitii_recapitulative.ex2;

public class RecursiveSum {
    public static void main(String[] args) {
        // Tablou de numere întregi
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Calculăm suma numerelor pare
        int result = sumEven(numbers, 0);

        // Afișăm rezultatul
        System.out.println("Suma numerelor pare este: " + result);
    }

    // Metodă recursivă pentru a calcula suma numerelor pare
    public static int sumEven(int[] array, int index) {
        // Cazul de bază: am parcurs tot tabloul
        if (index == array.length) {
            return 0;
        }

        // Dacă elementul curent este par, îl adăugăm la sumă
        if (array[index] % 2 == 0) {
            return array[index] + sumEven(array, index + 1);
        }

        // Dacă nu este par, continuăm fără să-l adăugăm
        return sumEven(array, index + 1);
    }
}
