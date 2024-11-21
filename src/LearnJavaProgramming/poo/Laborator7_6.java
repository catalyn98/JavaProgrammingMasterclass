package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_6 {

    public static void main(String[] args) {
        int n, m, i, j, k;
        System.out.print("Introduceti numarul de elemente ale multimii A (n) = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("Introduceti numarul de elemente ale multimii B (m) = ");
        m = input.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];

        System.out.println("Introduceti elementele multimii A: ");
        for (i = 0; i < n; i++) {
            System.out.print("A[" + i + "]=");
            A[i] = input.nextInt();
        }

        System.out.println("Introduceti elementele multimii B: ");
        for (i = 0; i < m; i++) {
            System.out.print("B[" + i + "]=");
            B[i] = input.nextInt();
        }

        int C[] = new int[100];
        // Copiem elementele din multimea A in multimea C
        for (i = 0; i < n; i++)
            C[i] = A[i];
        k = n; // k reprezinta numarul de elemente din multimea C
        for (j = 0; j < m; j++) {
            boolean ok = true;
            for (i = 0; i < n; i++)
                if (B[j] == A[i])
                    ok = false;
            if (ok == true) {
                C[k] = B[j];
                k++;
            }
        }

        for (i = 0; i < k; i++)
            System.out.print(C[i] + " ");
    }
}
