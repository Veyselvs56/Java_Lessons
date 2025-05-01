import java.util.Scanner;
public class Sezar {   // sezar şifrelemesi girilen harften 3 sonraki harfi alarak şifreler
    public static void main(String[] args){

        Scanner giris=new Scanner(System.in);
        System.out.println("Kelime :");
        String kelime=giris.nextLine();
        kelime.toLowerCase();       // küçük harfe dönüştür
        char[] k=kelime.toCharArray();  // metni karakter dizisine dönüştür
        System.out.print("\nŞifrelenmiş kelime:");
        for(int i=0;i<kelime.length();i++){
            k[i]=(char)(kelime.codePointAt(i)+4); //yada k[i]=(char)(4+k[i]);
            System.out.printf("%c",k[i]);
        }
    }
}
