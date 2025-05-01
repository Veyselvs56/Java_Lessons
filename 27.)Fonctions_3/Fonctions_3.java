import java.util.Scanner;
public class Fonctions_3 {  // dört işlem hesap makinesi örneği
    static void menu() {  // parametre almayan ve değer döndürmeyen bir fonksiyon
        System.out.println("[1] Toplama");
        System.out.println("[2] Cıkarma");
        System.out.println("[3] Carma");
        System.out.println("[4] Bolme");
    }

    static double Hesapla(double a, double b, int secim) { /* double fonksiyon altında int tanımlanabilir tersi hatalı olur */
        double sonuc=0;
        switch (secim) {
            case 1:
                sonuc = a + b;
                break;
            case 2:
                sonuc = a - b;
                break;
            case 3:
                sonuc = a * b;
                break;
            case 4:
                if (b == 0){
                    System.out.println("lütfen paydaya 0 yazmayınız");
                }
                else {
                    sonuc = (double) a / b;
                }
                break;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        double s1, s2, sonuc;
        int islem;
        char cevap;
        Scanner giris = new Scanner(System.in);
        do {
            menu();
            System.out.println("iki sayı girin lütfen=");
            s1 = giris.nextInt();
            s2 = giris.nextInt();

            System.out.print("işlem :");
            islem = giris.nextInt();
            sonuc = Hesapla(s1, s2, islem);
            System.out.println("sonuc= " + sonuc);
            System.out.println("tekrar işlem yapmak ister misiniz [E/H] ?");
            cevap = giris.next().charAt(0);
        } while (cevap == 'E' || cevap == 'e');
        System.out.println("iyi günler..");
    }
}