package Week9._1.Encapsulare._4.cresterea_riscului_de_atacuri_de_tip_injection.corect;

//Code wrote by Catalan Catalin

public class Main {
    public static void main(String[] args) {
        User user1 = new User("cătălan");
        User user2 = new User("accesa");
        User user3 = new User("lateral");

        Query query = new Query();

        // din cauza ca userul este admin pot vizualiza parola
        System.out.println(query.getDataBasePassword(user1.isAdmin()));
        System.out.println("____________________________________________________________________________________");

        // din cauza ca userul nu este admin nu poate vizualiza parola
        // se generează o excepție în terminal
        System.out.println(query.getDataBasePassword(user2.isAdmin()));
        System.out.println("____________________________________________________________________________________");

        // oricine va putea vizualiza numele bazei de date
        System.out.println(query.getDataBaseName(user3.getUsername()));
        System.out.println("____________________________________________________________________________________");

        // însă numai adminsitratorul bazei de date va putea schimba numele
        System.out.println(query.setDataBaseName(user1.isAdmin(), "DB_Banca_Transilvania"));
        System.out.println("____________________________________________________________________________________");
    }
}
