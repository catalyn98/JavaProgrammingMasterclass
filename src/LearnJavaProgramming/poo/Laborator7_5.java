package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_5 {

    public static void main(String[] args) {
        int n;
        System.out.print("Introduceti numarul n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int V[] = new int[20];
        int i = 0;

        while (n != 0) {
            V[i] = n % 10;
            n = n / 10;
            i++;
        }

        int cifre = i;
        for (i = 0; i < cifre; i++)
            System.out.print(V[i] + " ");
    }
}
