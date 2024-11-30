package Week9.Subgrupa1621B;

public class Software {
    private Boolean isLicense;
    private String name;
    private String version;

    public Boolean getLicense() {
        return isLicense;
    }

    public void setLicense(Boolean license) {
        isLicense = license;
    }

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

    public Software(Boolean isLicense, String name, String version) {
        this.isLicense = isLicense;
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Software{" +
                "isLicense=" + isLicense +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Software software = new Software(true, "Software", "1.0.0");
        System.out.println(software);
    }
}
