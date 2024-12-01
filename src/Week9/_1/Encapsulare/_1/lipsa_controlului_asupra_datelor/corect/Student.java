package Week9._1.Encapsulare._1.lipsa_controlului_asupra_datelor.corect;

//Code wrote by Catalan Catalin

public class Student {
    private int age; // Variabilă privată

    public void setAge(int age) {
        if (age > 0) {
            this.age = age; // Doar valori valide sunt acceptate
        } else {
            System.out.println("Vârsta trebuie să fie mai mare decât 0!");
        }
    }
}
