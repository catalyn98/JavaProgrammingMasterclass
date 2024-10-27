package Week3.exercises;

/* studentii care s-au oferit voluntar sa partajeze ecranul/sa iasa la tabla
   pentru a rezolva problemele introductive propuse sunt:
   - Bogdan D. David-Vlad (TI) - ora de laborator s-a realizat online (luni, 14 oct.)
   - Bran Claudiu (C) - ora de laborator s-a realizat online (marti, 15 oct.)
   - Sava Alexandru-Claudiu (C) - ora de laborator s-a realizat fizic (joi, 17 oct.)
 */
public class RecursiveSum {
    public static void main(String[] args){
        int n = 5;
        int sum = recursiveSum(n);
        System.out.println("Suma numerelor de la 1 la " + n + " este " + sum);
    }
    public static int recursiveSum(int num){
        if(num > 0){
            return num + recursiveSum(num-1);
        }else{
            return 0;
        }
    }
}
