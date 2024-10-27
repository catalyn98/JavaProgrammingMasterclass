package Week3.exercises;
/* studentii care s-au oferit voluntar sa partajeze ecranul/sa iasa la tabla
   pentru a rezolva problemele introductive propuse sunt:
   - Bogdan David-Vlad (TI) - ora de laborator s-a realizat online (luni, 14 oct.)
   - Bran Claudiu (C) - ora de laborator s-a realizat online (marti, 15 oct.)
   - Sava Alexandru-Claudiu (C) - ora de laborator s-a realizat fizic (joi, 17 oct.)
 */

public class CircleArea {
    public static double calculateArea(double raza){
        return Math.PI * raza * raza;
    }

    public static void main(String[] args){
        double radius = 7.5;
        double area = calculateArea(radius);
        System.out.println("Raza cercului este: " + area);
    }
}
