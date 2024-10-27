package Week3.exercises;

/* studentii care s-au oferit voluntar sa partajeze ecranul/sa iasa la tabla
   pentru a rezolva problemele introductive propuse sunt:
   - Bogdan D. David-Vlad (TI) - ora de laborator s-a realizat online (luni, 14 oct.)
   - Bran Claudiu (C) - ora de laborator s-a realizat online (marti, 15 oct.)
   - Sava Alexandru-Claudiu (C) - ora de laborator s-a realizat fizic (joi, 17 oct.)
 */
public class TypeCasting {
    public static void main(String[] args) {
        int myIntNumber = 100;
        double myDoubleNumber = 100.673;
        //conversie implicita de la int la double
        double myDouble = myIntNumber;
        System.out.println(myDouble);
        //conversie explicita de la double la int
        int anotherInt = (int) myDoubleNumber;
        System.out.println(anotherInt);
    }
}
