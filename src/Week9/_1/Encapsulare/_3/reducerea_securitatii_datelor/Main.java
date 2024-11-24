package Week9._1.Encapsulare._3.reducerea_securitatii_datelor;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.username);
        System.out.println(user.password); // Parola este expusă
    }
}
