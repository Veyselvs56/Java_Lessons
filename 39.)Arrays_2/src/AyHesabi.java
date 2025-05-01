import java.util.Scanner;   //İNDİS DEĞERİNE GÖRE AYLARI YAZAN PROGRAM

public class AyHesabi {
    private static Scanner giris; // eğer giris değişkenini çok kullanmıyorsak bunu yazmaya gerek yok direk
    // girisin başına Scanner yazmak yeterli ve private ön eki sayesinde sadece bu sınıfın içinde çalışmasını sağlar

    public static void main(String[] args) {
        String[] A = {"Ocak", "Şubat", "mart", "nisan","mayıs","haziran","temmuz","ağustos", "eylül", "ekim", "kasım", "aralık"};
        giris = new Scanner(System.in);
        int ay;
        System.out.println("Ay değerini giriniz=");
        ay = giris.nextInt();
        System.out.println(ay + ". ay= " + A[ay - 1]); // -1 dememizin sebebi dizi 0 dan başlıyor kullanıcı 1. ayı girerse
        // ocak ayının yazması için 0. indisin çalışması lazım
    }
}
