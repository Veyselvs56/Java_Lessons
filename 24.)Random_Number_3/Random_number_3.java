import java.util.Scanner;   // Puanlı sayı tahmin oyunu
public class Random_number_3 {
    public static void main(String[] args) {
        int tahmin,sayac=0,puan=100;
        Scanner giris=new Scanner(System.in);
        int sayi=(1+(int) (Math.random()*100));    // 1 ile 100 arasında random sayı ürettik
        System.out.println("ilk Tahmininiz:");
        do{
            tahmin=giris.nextInt();
            sayac++;
            if(tahmin==sayi)
                System.out.println("Bravo "+sayac+" tahminde "+sayi+" sayısını buldunuz");
            else if(tahmin<sayi)
                System.out.println("daha büyük bir sayı girin");
            else
                System.out.println("daha küçük bir sayı girin");
            puan -=10;
        }while(tahmin !=sayi);
        System.out.println("puanınız="+puan);
    }
}