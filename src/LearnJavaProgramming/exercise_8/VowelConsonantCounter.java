package LearnJavaProgramming.exercise_8;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Șirul de caractere dat
        String text = "Java este un limbaj de programare orientat-obiect, puternic tipizat, conceput de către James Gosling la Sun Microsystems, acum filială Oracle";

        // Inițializarea variabilelor pentru numărarea vocalelor și consoanelor
        int vowels = 0;
        int consonants = 0;

        // Convertirea șirului la litere mici pentru a simplifica verificarea
        text = text.toLowerCase();

        // Parcurgerea fiecărui caracter din șir
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Verificăm dacă este vocală
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Verificăm dacă este consoană (litera între 'a' și 'z' și nu este vocală)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Afișarea rezultatului
        System.out.println("Numărul de vocale: " + vowels);
        System.out.println("Numărul de consoane: " + consonants);
    }
}
