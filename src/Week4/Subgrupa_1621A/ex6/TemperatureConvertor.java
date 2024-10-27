package Week4.Subgrupa_1621A.ex6;
import java.util.Scanner;
//Code wrote by Foica David-Andrei
public class TemperatureConvertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Farenheit: ");
        double temperaturaFarenheit = scanner.nextDouble();
        System.out.println("Temperatura in grade Celsius este: " +  celsiusConvertor(temperaturaFarenheit));
        System.out.println("Introduceti temperatura in Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        System.out.println("Temperatura in grade Farenheit este: " + farenheitConvertor(temperaturaCelsius));
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
    public static double farenheitConvertor (double temperaturaCelsius){
        return (temperaturaCelsius * 9 / 5) + 32;
    }
    public static double celsiusConvertor (double temperaturaFarenheit){
        return (temperaturaFarenheit - 32) * 5 / 9;
    }
}
