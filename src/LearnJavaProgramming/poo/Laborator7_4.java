package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_4 {

    public static void main(String[] args) {
        int n, a;
        System.out.print("Introduceti numarul de elemente n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("Introduceti numarul a = ");
        a = input.nextInt();
        int V[] = new int[n];
        int i, suma = 0;

        for (i = 0; i < n; i++) {
            System.out.print("V[" + i + "]=");
            V[i] = input.nextInt();
        }

        for (i = 0; i < n; i++)
            if (V[i] % a == 0)
                suma += V[i];

        System.out.print("Suma elementelor din vector care sunt divizibile cu a este = " + suma);
    }
}
