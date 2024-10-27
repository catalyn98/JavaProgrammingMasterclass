package Week3.exercises;

/* studentii care s-au oferit voluntar sa partajeze ecranul/sa iasa la tabla
   pentru a rezolva problemele introductive propuse sunt:
   - Bogdan D. David-Vlad (TI) - ora de laborator s-a realizat online (luni, 14 oct.)
   - Bran Claudiu (C) - ora de laborator s-a realizat online (marti, 15 oct.)
   - Sava Alexandru-Claudiu (C) - ora de laborator s-a realizat fizic (joi, 17 oct.)
 */
public class DisplayMatrix {
    public static void main(String[] args){
        int[][] matrix = {{5,4,8},{1,2,3},{9,8,7}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
