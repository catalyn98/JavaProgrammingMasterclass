package LearnJavaProgramming.solutii_exercitii_recapitulative.ex1;

public class CharacterCounter {
    public static void main(String[] args) {
        // Text hardcodat
        String text = "Salut! Acesta este un program creat cu ajutorul limbajului de Programare Java.";

        // Apelarea metodei și afișarea rezultatului
        countCharacters(text);
    }

    // Metodă pentru a număra literele mici, literele mari și alte caractere
    public static void countCharacters(String text) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int otherCount = 0;

        // Parcurgerea fiecărui caracter din text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowercaseCount++; // Incrementare pentru litere mici
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++; // Incrementare pentru litere mari
            } else {
                otherCount++; // Incrementare pentru alte caractere
            }
        }

        // Afișarea rezultatelor
        System.out.println("Număr de litere mici: " + lowercaseCount);
        System.out.println("Număr de litere mari: " + uppercaseCount);
        System.out.println("Număr de alte caractere: " + otherCount);
    }
}
