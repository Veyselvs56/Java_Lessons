public class ThueMorse {   /*thueMorse dizisi parametre 0 ise ekrana 0 değerinni string olarak yazar
*/
    static String thuemorse(int n){
        if(n==0) return"0";
        String tm=thuemorse(n-1);
        String tm2="";
        for(int i=0;i<tm.length();i++)
            if(tm.charAt(i)=='0')      //charAt tm nin i. pozisyonundaki karakteri döndürür
                tm2+="01";
            else tm2+="10";

            return tm2;
    }
    public static void main(String[] args){

        System.out.println("Thue-Morse dizisi..:");
        for(int i=0;i<5;i++){
            System.out.println(i+":"+thuemorse(i));
        }
    }
}