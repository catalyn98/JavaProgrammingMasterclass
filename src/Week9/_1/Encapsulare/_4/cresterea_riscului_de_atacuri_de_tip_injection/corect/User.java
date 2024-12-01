package Week9._1.Encapsulare._4.cresterea_riscului_de_atacuri_de_tip_injection.corect;

//Code wrote by Catalan Catalin

public class User {
    private String username;
    private boolean isAdmin = false;

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setAdmin(String username) {
        isAdmin = username.equals("cătălan");
    }

    public User(String username) {
        this.username = username;
        setAdmin(username);
    }
}
