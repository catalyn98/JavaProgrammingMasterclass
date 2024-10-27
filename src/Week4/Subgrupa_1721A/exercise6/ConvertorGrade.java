package Week4.Subgrupa_1721A.exercise6;
import java.util.Scanner;
//Code wrote by Codreanu Andrei Vasile
public class ConvertorGrade {
    public static double convertCelsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduceti numarul de grade celsius pe care doriti sa il convertiti: ");
        double numarGradeCelsius = scanner.nextInt();
        System.out.println("Numarul de grade in farenheit este: " + convertCelsiusToFahrenheit(numarGradeCelsius));
        convertCelsiusToFahrenheit(numarGradeCelsius);
        System.out.println("Introduceti numarul de grade Farenheit: ");
        double numarGradeFarenheit = scanner.nextInt();
        System.out.println("Numarul de grade in celsius este: " + convertFahrenheitToCelsius(numarGradeFarenheit));
        convertFahrenheitToCelsius(numarGradeFarenheit);
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
