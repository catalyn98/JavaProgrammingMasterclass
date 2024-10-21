package LearnJavaProgramming.exercise_7;

public class ArrayStatistics {
    public static void main(String[] args) {
        // Definirea unui array de numere întregi
        int[] numbers = {34, 67, 23, 90, 12, 78, 45};

        // Variabilă pentru a stoca valoarea maximă
        int max = numbers[0];  // Inițializăm cu prima valoare din array

        // Parcurgerea array-ului pentru a găsi valoarea maximă
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // Actualizăm valoarea maximă
            }
        }

        // Afișarea valorii maxime
        System.out.println("Cea mai mare valoare din array este: " + max);
    }
}
