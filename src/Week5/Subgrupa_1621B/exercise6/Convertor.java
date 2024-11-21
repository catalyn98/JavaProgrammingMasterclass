package Week5.Subgrupa_1621B.exercise6;

import java.util.Scanner;
//Code wrote by Polevoi Florin

public class Convertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti temp. in grade C: ");
        double tempC = scanner.nextDouble();
        System.out.println("Introduceti temp. in grade F: ");
        double tempF = scanner.nextDouble();
        System.out.println("Temp. in Fahrenheit este: " + convertCelsiusToFahrenheit(tempF));
        System.out.println("Temp. in Celsius este: " + convertFahrenheitToCelsius(tempC));
        scanner.close();
    }
    public static double convertCelsiusToFahrenheit(double celsius){
        return celsius * 9/5 + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
