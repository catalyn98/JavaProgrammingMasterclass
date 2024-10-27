package Week3.exercises;

import java.util.Scanner;
/* studentii care s-au oferit voluntar sa partajeze ecranul/sa iasa la tabla
   pentru a rezolva problemele introductive propuse sunt:
   - Bogdan D. David-Vlad (TI) - ora de laborator s-a realizat online (luni, 14 oct.)
   - Bran Claudiu (C) - ora de laborator s-a realizat online (marti, 15 oct.)
   - Sava Alexandru-Claudiu (C) - ora de laborator s-a realizat fizic (joi, 17 oct.)
 */

public class ControlStructure {
    public static void main(String[] args){
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int number = myScaner.nextInt();
        if(number > 0){
            System.out.println("Numarul este pozitiv");
        }else if(number<0){
            System.out.println("Numarul este negativ");
        }else{
            System.out.println("Numarul este 0");
        }
        myScaner.close();
    }
}
