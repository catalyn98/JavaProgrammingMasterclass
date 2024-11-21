package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_8 {

    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de linii (n) = ");
        n = input.nextInt();
        System.out.print("Introduceti numarul de coloane (m) = ");
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
            for (j = 0; j < m; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

        int B[][] = new int[m][n];
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                B[j][i] = A[i][j];

        System.out.println("Matricea transpusa este: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }
    }
}
