package LearnJavaProgramming.exercise_3;

import java.util.Scanner;

public class ServerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: numărul total de linii de cod care trebuie procesate și capacitatea unui server
        System.out.println("Introdu numărul total de linii de cod care trebuie procesate: ");
        int totalLinesOfCode = scanner.nextInt();  // Tip primitiv int pentru numărul total de linii de cod

        System.out.println("Introdu capacitatea unui server (linii de cod procesate pe secundă): ");
        int linesPerServer = scanner.nextInt();  // Tip primitiv int pentru numărul maxim de linii procesate pe secundă de un server

        // Calcularea numărului de servere necesare
        double serversNeeded = (double) totalLinesOfCode / linesPerServer;  // Conversie explicită de la int la double

        // Rotunjirea în sus a numărului de servere (pentru a acoperi toate liniile de cod)
        int roundedServersNeeded = (int) Math.ceil(serversNeeded);  // Conversie explicită de la double la int

        // Afișarea rezultatului
        System.out.println("Numărul de servere necesare pentru a procesa toate liniile de cod: " + roundedServersNeeded);

        scanner.close();
    }
}
