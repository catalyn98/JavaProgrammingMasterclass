package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_3 {

    public static void main(String[] args) {
        int n;
        System.out.print("Introduceti numarul de elemente n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        double V[] = new double[n];
        int i, j;
        double temp;

        for (i = 0; i < n; i++) {
            System.out.print("V[" + i + "]=");
            V[i] = input.nextDouble();
        }

        for (i = 0; i < n - 1; i++)
            for (j = i + 1; j < n; j++)
                if (V[i] > V[j]) {
                    temp = V[i];
                    V[i] = V[j];
                    V[j] = temp;
                }

        for (i = 0; i < n; i++)
            System.out.print(V[i] + " ");
    }
}
