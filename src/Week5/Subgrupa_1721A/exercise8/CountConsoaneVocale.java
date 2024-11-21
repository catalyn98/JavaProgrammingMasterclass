package Week5.Subgrupa_1721A.exercise8;

//Code wrote by Bene Daniel Andrei

public class CountConsoaneVocale {
    public static void main(String[] args){
        String text = "Java este un limbaj de programare orientat-obiect, " +
                "puternic tipizat, conceput de catre James Gosling la Sun Microsystems, acum filiala Oracle";
        int nrVocale = 0;
        int nrConsoane = 0;
        text = text.toLowerCase();
        for(int i = 0; i<text.length(); i++){
            char litera = text.charAt(i);
            if(litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u'){
                nrVocale++;
            }
            else if(litera >= 'a' && litera <= 'z'){
                nrConsoane++;
            }
        }
        System.out.println("Nr vocale: " + nrVocale);
        System.out.println("Nr consoane: " + nrConsoane);
    }
}
