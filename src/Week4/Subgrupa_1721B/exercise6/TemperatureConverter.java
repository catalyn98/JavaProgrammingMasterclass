package Week4.Subgrupa_1721B.exercise6;
import java.util.Scanner;
//Code wrote by Doba Bogdan-Darius
public class TemperatureConverter {
    public static double convertCelsiusToFahrenheit(double celsius)
    {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti temperatura in Celsius: ");
        double temperatureC= scanner.nextInt();
        System.out.println("Temperatura in Fahrenheit este: "+convertCelsiusToFahrenheit(temperatureC));
        System.out.println("Introduceti temperatura in Fahrenheit: ");
        double temperatureF= scanner.nextInt();
        System.out.println("Temperatura in Celsius este: "+convertFahrenheitToCelsius(temperatureF));
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
