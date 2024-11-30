package Week9.Subgrupa1721A;

public class Software {
    private String name;
    private String version;
    private boolean isLicensed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }

    public Software(String name, String version, boolean isLicensed) {
        this.name = name;
        this.version = version;
        this.isLicensed = isLicensed;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", isLicensed=" + isLicensed +
                '}';
    }

    public static void main(String[] args) {
        Software software = new Software("Software Name", "Software Version", true);
        System.out.println(software);
    }
}
