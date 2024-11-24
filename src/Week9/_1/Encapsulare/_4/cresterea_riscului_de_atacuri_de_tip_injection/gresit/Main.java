package Week9._1.Encapsulare._4.cresterea_riscului_de_atacuri_de_tip_injection.gresit;

public class Main {
    public static void main(String[] args) {
        Query query= new Query();
        // această comandă șterge întreaga tabelă ce conține utilizatori aplicației
        // întrucât nu există restricții de acces oricine poate executa această comandă
        query.sqlQuery = "DROP TABLE users;";
        /*
           atribuirea directă a unui nume modificat pentru baza de date
           permite schimbarea valorii fără nicio verificare sau validare
        */
        query.dataBaseName = "modifiedName";
        /*
           accesarea directă a atributului dataBasePassword
           și afișarea lui prin System.out.println()
           face ca parola bazei de date să fie vizibilă
           ceea ce expune parola atacatorilor
         */
        System.out.println(query.dataBasePassword);
    }
}
