package Week5.Subgrupa_1621A.exercise8;

//Code wrote by Laza Lukas

public class VocaleSiConsoane {
    public static void main(String[] args){
        String text = "Java";
        int vocale= 0;
        int consoane=0;
        text=text.toLowerCase();
        for (int i=0;i<text.length();i++) {
            char ch=text.charAt(i);
            if (ch == 'a'|| ch =='e' ||ch == 'i' || ch =='o' || ch =='u'){
                vocale++;
            }
            else if (ch >= 'a' && ch <= 'z' ){
                consoane++;
            }
        }
        System.out.println("Numarul de vocale este: "+ vocale);
        System.out.println("Numarul de consoane este: "+ consoane);
    }
}
