import java.util.Scanner;
public class Error_and_exception_6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.print("Lütfen 2 -20 arasında bir sayı giriniz:");

        int sayi = giris.nextInt();

        assert (sayi%2==0  || sayi==9  || sayi==15 ) : (sayi+"Asaldır");
        System.out.printf("Girilen %d\n", sayi);

        /* assert=ileri sürmek ,iddia etmek anlamına gelir olası hataları test etmekte kullanılır
         birinci assert koşulu geçersiz ise AssertionError istisnası tetiklenir ikincideki geçerli ise
          AssertionError çalışır */
    }
}