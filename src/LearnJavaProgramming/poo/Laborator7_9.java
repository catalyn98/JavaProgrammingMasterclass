package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_9 {

    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de linii (n) = ");
        n = input.nextInt();
        System.out.print("Introduceti numarul de coloane m = ");
        m = input.nextInt();

        int A[][] = new int[n][m];
        int i, j;

        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                A[i][j] = input.nextInt();
            }

        System.out.println("Matricea citita este: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(" " + A[i][j]);
            System.out.println();
        }

        int V[] = new int[n], suma;
        for (i = 0; i < n; i++) {
            suma = 0;
            for (j = 0; j < m; j++)
                suma += A[i][j];
            V[i] = suma;
        }

        System.out.println("Vectorul suma este: ");
        for (i = 0; i < n; i++)
            System.out.print(" " + V[i]);
    }
}
