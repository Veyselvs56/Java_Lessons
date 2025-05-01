import java.util.Scanner;  // yazılan cümledeki harf ve kelime sayısını bulan program
public class harf_kelime {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        System.out.println("Cümle: ");
        String cumle=giris.nextLine();
        int harf_sayac=0,kelime_sayac=1;
        for(int i=0;i<cumle.length();i++){
            char k=cumle.charAt(i);         //charAt String ifadede belirtilen indis değerini verir
            if(Character.isLetter(k))       //Character.isLetter(k) k nın harf olup olmadığını kontrol eder
                harf_sayac++;
            if(Character.isSpaceChar(k))    //Character.isSpaceChar(k) k nın boşluk olup olmadığını kontrol eder
                kelime_sayac++;
        }
        System.out.println("harf sayisi..:"+harf_sayac);
        System.out.println("Kelime sayisi..:"+kelime_sayac);
    }
}
