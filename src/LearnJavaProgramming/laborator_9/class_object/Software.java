package LearnJavaProgramming.laborator_9.class_object;

public class Software {
    private String name;
    private String version;
    private boolean isLicensed;

    // Constructor
    public Software(String name, String version, boolean isLicensed) {
        this.name = name;
        this.version = version;
        this.isLicensed = isLicensed;
    }

    // Metode get()
    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    // Metode set()
    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setLicensed(boolean isLicensed) {
        this.isLicensed = isLicensed;
    }

    // Metoda toString()
    @Override
    public String toString() {
        return "Software [Name: " + name + ", Version: " + version + ", Licensed: " + (isLicensed ? "Yes" : "No") + "]";
    }

    // Metoda main pentru testare
    public static void main(String[] args) {
        Software software = new Software("IntelliJ IDEA", "2024.2", true);
        System.out.println(software);
    }
}
