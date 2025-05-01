import java.util.Scanner;
public class Polindrom {
    public static void isPolindrom(String s1){

        String s2=tersCevir(s1);
        if(s2.equals(s1))             //Equals() nesnenin içerdiği string'i karşılaştırır.
            System.out.println("evet polindromdur");
        else
            System.out.println("hayır polindrom değildir");
    }
    public static String tersCevir(String s){
        StringBuilder str=new StringBuilder(s);
        return str.reverse().toString();   // toString nesnelerin metin karşılığını yazar reverse ise ters çevirir
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir metin girin lütfen: ");
        String s=input.nextLine();
        System.out.println(s+" polindrom mu ? ");
        isPolindrom(s);
    }
}