package Week4.Subgrupa_1722A.exercise4;
import java.util.Scanner;
//Code wrote by Istoc Adelin
public class ProgramerType {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti nr de ore pe care le petreceti pentru a programa: ");
        int numarDeOre=scanner.nextInt();
        if (numarDeOre<=2){
            System.out.println("Programator junior");
        } else if (numarDeOre>=3&&numarDeOre<=5) {
            System.out.println("Programator Middle");
        } else if (numarDeOre>=6&&numarDeOre<=8) {
            System.out.println("Programator Senior");
        }
        else {
            System.out.println("Valoarea nu se afla in interval");
        }
    }
}
