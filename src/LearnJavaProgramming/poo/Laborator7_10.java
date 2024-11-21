package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_10 {

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

        int max, min;

        for (j = 0; j < m; j++) {
            max = -10000;
            for (i = 0; i < n; i++)
                if (max < A[i][j])
                    max = A[i][j];
            System.out.println("Maximul coloanei " + j + " este egal cu " + max);
        }

        for (i = 0; i < n; i++) {
            min = 10000;
            for (j = 0; j < m; j++)
                if (min > A[i][j])
                    min = A[i][j];
            System.out.println("Minimul liniei " + i + " este egal cu " + min);
        }
    }
}
