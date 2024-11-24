package Week9._1.Encapsulare._4.cresterea_riscului_de_atacuri_de_tip_injection.corect;

public class Query {
    private String dataBaseName = "BankingDataBase";
    private String dataBasePassword = "rx%o*%Zu[Xp-$10z";

    // oricine va putea vizualiza numele bazei de date
    public String getDataBaseName(String username) {
        if(username!=null )
            return dataBaseName;
        else
            return "Hmm... se pare că ceva nu funcționează corect. Încearcă să te conectezi în aplicație folosind username-ul și parola";
    }

    // însă numai adminsitratorul bazei de date va putea schimba numele
    public String setDataBaseName(boolean isAdmin, String dataBaseName) {
        if(isAdmin) {
            this.dataBaseName = dataBaseName;
            System.out.println("Numele a fost actualizat!");
        }
        else
            throw new IllegalArgumentException("Acces restricționat! Nu ai permisiunea să modifici numele!");
        return "Noul nume este " + dataBaseName;
    }

    public String getDataBasePassword(boolean isAdmin) {
        if(isAdmin)
            return dataBasePassword;
        else
            throw new IllegalArgumentException("Acces restricționat! Nu ai permisiunea să vizualizezi parola!");
    }
}
