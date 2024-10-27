package Week4.Subgrupa_1621B.ex4;
import java.util.Scanner;
//Code wrote by Polevoi Florin
public class ProgramerType {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de ore in care programezi pe zi: ");
        int totalHoursOfCodeing = scanner.nextInt();
        if(totalHoursOfCodeing >= 0 && totalHoursOfCodeing <= 2){
            System.out.println("Esti programator Junior");
        } else if (totalHoursOfCodeing >= 3 && totalHoursOfCodeing <= 5) {
            System.out.println("Esti programator Mid");
        } else if (totalHoursOfCodeing >= 6 && totalHoursOfCodeing <= 8) {
            System.out.println("Esti programator Senior");
        }else{
            System.out.println("Valoarea introdusă nu se află în nici un interval");
        }
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
