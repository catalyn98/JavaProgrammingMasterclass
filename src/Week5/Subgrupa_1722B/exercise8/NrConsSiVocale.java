package Week5.Subgrupa_1722B.exercise8;

//Code wrote by Tamas Rares
public class NrConsSiVocale {
    public static void main(String []args)
    {
        String text = "Java este un limbaj de programare orientat-obiect, puternic tipizat, conceput de catre James Gosling la Sun Microsystems, acum filiala Oracle";
        int nrCons = 0;
        int nrVocale = 0;
        text = text.toLowerCase();
        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            if(ch == 'a' || ch ==  'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                nrVocale++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                nrCons++;

            }
        }
        System.out.println("Nr. de consoane este: " + nrCons);
        System.out.println("Nr. de vocale este: " + nrVocale);
    }
}
