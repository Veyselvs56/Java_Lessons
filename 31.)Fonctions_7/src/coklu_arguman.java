public class coklu_arguman {  //FONKSİYONLARDA VERAİBLE ARGUMENTS KULLANMAK
    public static int topla(int... sayilar) {   //birden fazla değişken göndereceğimizi belirttik yani veraible arguments
        int toplam = 0;                       // bu yapı sıklıklar kullanılır bunun yerine koleksiyonlar da kullanılabilir
        for (int sayi:sayilar) {              // sayılar değişkenine gelen tüm değerleri tek tek sayi ya atar
            toplam=toplam+sayi;
        }
        return toplam;
    }
    public static void main(String[] args) {
        int sayi = topla(2, 3, 4, 5, 8, 10);
        System.out.println(sayi);
    }
}