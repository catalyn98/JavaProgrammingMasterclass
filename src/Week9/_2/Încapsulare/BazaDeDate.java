package Week9._2.Încapsulare;

public class BazaDeDate {
    // Atribute private (încapsulate)
    private String url;
    private String username;
    private String parola;

    // Constructor
    public BazaDeDate(String url, String username, String parola) {
        this.url = url;
        this.username = username;
        this.parola = parola;
    }

    // Metodele get() și set() pentru a accesa și modifica atributele
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Nu oferim un set() pentru parolă pentru a menține securitatea
    public String getParola() {
        return "Acces restricționat";
    }

    public void schimbaParola(String parolaNoua) {
        if (parolaNoua.length() >= 8) {
            this.parola = parolaNoua;
            System.out.println("Parola a fost schimbată cu succes.");
        } else {
            System.out.println("Parola trebuie să aibă cel puțin 8 caractere.");
        }
    }

    public void afiseazaDetaliiConectare() {
        System.out.println("URL: " + url + ", Username: " + username);
    }
}
