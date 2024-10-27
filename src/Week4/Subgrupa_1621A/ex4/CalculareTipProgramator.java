package Week4.Subgrupa_1621A.ex4;
import java.util.Scanner;
//Code wrote by Bodea Luca
public class CalculareTipProgramator {
    public static void main(String[] args){
        System.out.println("Introduceti numarul de ore pe care il petreceti zilnic programand: ");
        Scanner scanner=new Scanner(System.in);
        int numarulDeOre = scanner.nextInt();
        if(numarulDeOre<2){
            System.out.println("Esti un programator Junior.");
        } else if (numarulDeOre>=3 && numarulDeOre<=5) {
            System.out.println("Esti un programator Mid.");
        } else if (numarulDeOre>=6 && numarulDeOre<=8) {
            System.out.println("Esti un programator Senior.");
        } else{
            System.out.println("Numarul introdus este invalid.");
        }
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
