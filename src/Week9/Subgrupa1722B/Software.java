package Week9.Subgrupa1722B;

public class Software {
   private String name;
   private String version;
   private boolean isLincensed;

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

    public boolean isLincensed() {
        return isLincensed;
    }

    public void setLincensed(boolean lincensed) {
        isLincensed = lincensed;
    }

    public Software(String name, String version, boolean isLincensed) {
        this.name = name;
        this.version = version;
        this.isLincensed = isLincensed;
    }


    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", isLincensed=" + isLincensed +
                '}';

    }

    public static void main(String[] args) {
        Software software = new Software("Software Name", "Version", true);
        System.out.println(software);
    }
}
