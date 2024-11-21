package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_2 {

    public static void main(String[] args) {
        int n;
        System.out.print("Introduceti numarul de elemente n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int V[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("V[" + i + "]=");
            V[i] = input.nextInt();
        }
        int max = V[0];
        for (i = 1; i < n; i++) {
            if (max < V[i]) max = V[i];
        }
        System.out.println("Valoarea maxima este " + max);
    }
}

