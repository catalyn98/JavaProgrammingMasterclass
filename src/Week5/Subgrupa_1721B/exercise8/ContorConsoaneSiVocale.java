package Week5.Subgrupa_1721B.exercise8;
//Cozi David
public class ContorConsoaneSiVocale {
    public static void main(String[] args)
    {
       String text="Java este un limbaj de programare orientat-obiect, puternic tipizat, conceput de către James Gosling la S'un Microsystems, acum filiala Oracle";
       int consoane=0;
       int vocale=0;
       text=text.toLowerCase();
       for(int i=0; i<text.length(); i++)
       {
           char ch=text.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o')
           {
               vocale++;
           }
           else
               if(ch>='a'&&ch<='z')
                   consoane++;
       }
        System.out.println("Numarul de consoane este: "+ consoane +" iar numarul de vocale este: "+vocale);
    }

}
