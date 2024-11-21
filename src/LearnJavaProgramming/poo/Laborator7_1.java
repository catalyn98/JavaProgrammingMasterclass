package LearnJavaProgramming.poo;

import java.util.Scanner;

public class Laborator7_1 {

    public static void main(String[] args) {

        System.out.println("Primul program in Java care citeste si afiseaza elementele unui vector");
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti n = ");
        n = input.nextInt();
        int V[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("V[" + i + "]=");
            V[i] = input.nextInt();
        }
        for (i = 0; i < n; i++)
            System.out.println(V[i]);
    }
}



