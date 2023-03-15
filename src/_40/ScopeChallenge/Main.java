package _40.ScopeChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        int scanner = new Scanner(System.in).nextInt();
        X x = new X(scanner);
        x.x();
    }
}
