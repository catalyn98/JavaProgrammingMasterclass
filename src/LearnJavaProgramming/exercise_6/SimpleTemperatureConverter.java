package LearnJavaProgramming.exercise_6;

import java.util.Scanner;

public class SimpleTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Alege tipul de conversie
        System.out.println("Introdu temperatura în Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversie din Celsius în Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius este " + fahrenheit + " Fahrenheit.");

        // Conversie inversă din Fahrenheit în Celsius
        System.out.println("Introdu temperatura în Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit este " + celsius + " Celsius.");

        scanner.close();
    }

    // Metodă pentru conversia din Celsius în Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Metodă pentru conversia din Fahrenheit în Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
