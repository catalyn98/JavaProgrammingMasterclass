package Week4.Subgrupa_1722A.exercise6;
import java.util.Scanner;
// CODE WROTE BY MARICEAN IULIAN
public class ConvertTemp {
    public static double convertCelsiusToFahrenheit(double celsius){
        return celsius * 9/5 + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti temperature in grade Celsius: ");
        double tempC=scanner.nextDouble();
        System.out.println("Introduceti temperature in grade Fahrenheit: ");
        double tempF=scanner.nextDouble();
        System.out.println("Temperatura in grade Celsius este: "+ convertFahrenheitToCelsius(tempF));
        System.out.println("Temperatura in grade Fahrenheit este: "+ convertCelsiusToFahrenheit(tempC));
    }
}
