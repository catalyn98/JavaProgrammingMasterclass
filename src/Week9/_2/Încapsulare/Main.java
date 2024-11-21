package Week9._2.Încapsulare;

// Clasa principală pentru a testa încapsularea
public class Main {
    public static void main(String[] args) {
        BazaDeDate db = new BazaDeDate("jdbc:mysql://localhost:3306/it_database", "admin", "parolaSecreta");

        // Accesarea detaliilor prin metodele get()
        System.out.println("URL: " + db.getUrl());
        System.out.println("Username: " + db.getUsername());
        System.out.println("Parola: " + db.getParola()); // Parola reală nu este expusă

        // Schimbarea parolei folosind metoda de setare cu validare
        db.schimbaParola("parolaNoua123");
    }
}
