package LearnJavaProgramming.poo;

public class Laborator7_7 {
    public static void main(String[] args) {
        int[] numere = new int[50];
        for (int i = 0; i < numere.length; ++i)
            numere[i] = 0;

        for (int i = 0; i < 1000; ++i)
            for (int j = 0; j < 6; ++j)
                // Genereaza numere de loterie intre 1 si 49
                numere[(int) (Math.random() * 49) + 1]++;
        // Numara aparitiile de numere pe joc
        for (int k = 1; k <= 49; ++k)
            System.out.println(k + ": " + numere[k]);
    }
}
