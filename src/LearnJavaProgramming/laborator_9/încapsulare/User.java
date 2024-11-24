package LearnJavaProgramming.laborator_9.încapsulare;

public class User {
    private String username;
    private boolean isAdmin = false;

    public User(String username) {
        this.username = username;
        setAdmin(username);
    }

    private void setAdmin(String username) {
        isAdmin = username.equalsIgnoreCase("admin");
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }
}
