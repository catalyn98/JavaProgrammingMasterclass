package Week4.Subgrupa_1722B.exercise6;
import java.util.Scanner;
//Code wrote by Ticarat Andrei Ionut
public class TemperatureConverter {
    public static double convertCelsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu temp in grade fahrenheit: ");
        double tempF = scanner.nextDouble();
        System.out.println("Temp in grade fahrenheit este: " + convertFahrenheitToCelsius(tempF));
        System.out.println("Introdu temp in grade celsius: ");
        double tempC = scanner.nextDouble();
        System.out.println("Temp in grade celsius este: " + convertCelsiusToFahrenheit(tempC));
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
