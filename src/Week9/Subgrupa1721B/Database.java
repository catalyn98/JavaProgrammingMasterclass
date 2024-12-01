package Week9.Subgrupa1721B;

//Code wrote by Catalan Catalin

public class Database {
    private String dbName;
    private Double dbSizeInGB;
    private boolean isEncrypted;

    public Database(String dbName, Double dbSizeInGB, boolean isEncrypted) {
        this.dbName = dbName;
        this.dbSizeInGB = dbSizeInGB;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "Database{" +
                "dbName='" + dbName + '\'' +
                ", dbSizeInGB=" + dbSizeInGB +
                ", isEncrypted=" + isEncrypted +
                '}';
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Double getDbSizeInGB() {
        return dbSizeInGB;
    }

    public void setDbSizeInGB(Double dbSizeInGB) {
        this.dbSizeInGB = dbSizeInGB;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    public static void main(String[] args) {
        Database database = new Database("UserDB", 15.5 , true);
        System.out.println(database);
    }
}
