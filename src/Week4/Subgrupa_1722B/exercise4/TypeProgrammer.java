package Week4.Subgrupa_1722B.exercise4;
//Code wrote by Perte Lavinia-Ioana-Maria
import java.util.Scanner;
public class TypeProgrammer {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de ore pe care le petreceti pentru a programa: ");
        int numarOre=scanner.nextInt();
        if(numarOre<=2)
            System.out.println("Programator Junior");
        else if (numarOre>=3 && numarOre<=5)
            System.out.println("Programator Mid");
        else if (numarOre>=6 && numarOre<=8)
            System.out.println("Programator Senior");
        else
            System.out.println("Nici o optiune nu corespunde cu valoarea");
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
