package Week9.Subgrupa1621B;

//Code wrote by Catalan Catalin

public class Database {
    private String dbName;
    private double dbSizeinGB;
    private boolean isEncrypted;

    public Database(String dbName, double dbSizeinGB, boolean isEncrypted) {
        this.dbName = dbName;
        this.dbSizeinGB = dbSizeinGB;
        this.isEncrypted = isEncrypted;
    }

    public String getDbName() {
        return dbName;
    }

    public double getDbSizeinGB() {
        return dbSizeinGB;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setDbSizeinGB(double dbSizeinGB) {
        this.dbSizeinGB = dbSizeinGB;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    @Override
    public String toString() {
        return "Database{" +
                "dbName='" + dbName + '\'' +
                ", dbSizeinGB=" + dbSizeinGB +
                ", isEncrypted=" + isEncrypted +
                '}';
    }

    public static void main(String[] args) {
        Database db=new Database("dbName",100.0,true);
        System.out.println(db);
    }

}
