import java.util.Scanner;    // YAZILAN KELİMEYİ TERS ÇEVİREN PROGRAM
public class dizi_Cevir {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
    System.out.print("cümle..:");
    String cumle=giris.nextLine(); //tek kelime alacaksak next ,cümle alacaksak nextline demeliyiz

    StringBuilder str=new StringBuilder(cumle); // str ye string build fonksiyonlarının çalışmasına izin verdik

        //StringBuilder String ifadeleri birleştirme ,ekleme için kullanılan bir sınıftır
        // StringBuilder sınıfı metotları
        // append()     =karakter dizisinin sonuna ekleme yapar
        // capacity()   =geçerli kapasite değerini döndürür
        // delete (int başlangıç,int bitiş)    =başlangıç ve bitiş değerleri aralığındaki karakterleri siler
        // replace (int başlangıç,int bitiş,String str)  = başlangıç ve bitiş değerleri arasını yeni karakterle değiştirir
        // deleteCharAt(int indis)=indis numarası verilen karakteri siler
        // insert(int ekleme yeri,String str) =karakter dizisinin istenen yerine ekleme yapar
        // reverse() =karakter dizisini ters çevirir
        // setCharAt(int indis,char ch)= indis numarası ile belirtilen yere istenen karakteri ekler
        // setLength(int yeniBoyut) =karakter dizisinin boyutunu arttırır veya azaltır.


    str.reverse();   // ters çevirme metodu str yi ters çevirir yani str nin kendisi ters çevrilmiş kalır
        System.out.println(str);

        // reverse kullanmadan
        System.out.print("cümle..:");
        String cumle_2=giris.nextLine();

        int uzunluk=cumle_2.length();
        for(int i=uzunluk-1;i>=0;i--){
            System.out.print(cumle_2.charAt(i));
        }
    }
}
