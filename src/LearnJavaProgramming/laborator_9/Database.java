package LearnJavaProgramming.laborator_9;

public class Database {
    private String dbName;
    private double dbSizeInGB;
    private boolean isEncrypted;

    // Constructor
    public Database(String dbName, double dbSizeInGB, boolean isEncrypted) {
        this.dbName = dbName;
        this.dbSizeInGB = dbSizeInGB;
        this.isEncrypted = isEncrypted;
    }

    // Metode get()
    public String getDbName() {
        return dbName;
    }

    public double getDbSizeInGB() {
        return dbSizeInGB;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    // Metode set()
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setDbSizeInGB(double dbSizeInGB) {
        this.dbSizeInGB = dbSizeInGB;
    }

    public void setEncrypted(boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    // Metoda toString()
    @Override
    public String toString() {
        return "Database [Name: " + dbName + ", Size: " + dbSizeInGB + " GB, Encrypted: " + (isEncrypted ? "Yes" : "No") + "]";
    }

    // Metoda main pentru testare
    public static void main(String[] args) {
        Database database = new Database("UserDB", 15.5, true);
        System.out.println(database);
    }
}

