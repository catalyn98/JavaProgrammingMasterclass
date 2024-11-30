package Week9.Subgrupa1721B;

public class Software {
    private String name;
    private String version;
    private boolean isLicenced;

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

    public boolean isLicenced() {
        return isLicenced;
    }

    public void setLicenced(boolean licenced) {
        isLicenced = licenced;
    }

    public Software(String name, String version, boolean isLicenced) {
        this.name = name;
        this.version = version;
        this.isLicenced = isLicenced;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", isLicenced=" + isLicenced +
                '}';
    }

    public static void main(String[] args) {
        Software software = new Software("Software Name", "Software Version", true);
        System.out.println(software);
        System.out.println(software.getName());
        software.setName("nume actualizat");
        System.out.println(software.getName());
    }
}
