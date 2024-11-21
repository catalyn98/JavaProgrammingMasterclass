package Week5.Subgrupa_1722A.exercise8;

//Code wrote by Istoc Adelin

public class ContorVocaleSiConsoane {
    public static void main(String []args){
        String text="Java este un limbaj de programare orientat-obiect, puternic tipizat, conceput de catre James Gosling la Sun Microsystems, acum filiala Oracle";
        int consoane=0;
        int vocale=0;
        text=text.toLowerCase();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vocale++;
            }
            else if (ch>='a'&&ch<='z') {
                consoane++;
            }

        }
        System.out.println("Numarul de consoane: "+consoane);
        System.out.println("Numarul de vocale: "+vocale);
    }
}
