import java.util.Scanner;    // hata ve istisnalarda istenilmeyen türde değerler girildiğinde
public class Errors_and_exceptions_1 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int b = 6;
        // mesela a yi 0 girersek veya harf girersek
        try { // normal program kodu buraya try bloğuna yazılır
            System.out.print("Bir sayı giriniz ");
            int a = giris.nextInt();
            System.out.println(b / a);

        } catch (Exception hata1) {    //try bloğunda bir hata oluşursa yapılacak işlemler buraya yazılır
            //catch in içine parametre olarak hata ismi tanımlıyoruz catch=tutmak
            System.out.println("oluşan hata ... " + hata1);
            System.out.println("hata izi...:");
            hata1.printStackTrace();   // hatanın nerde nerelerde gerçekleştiğini hangi türden oluştuğunu gösterir trace=iz

        } finally { // kullanımı zorunlu değildir her şart ve koşulda çalışacak kod buraya yazılır
            System.out.println("***Programdan çıkıldı**");
            System.exit(0);  // uygulamadan çıkış yapmamızı sağlar derleyiciye hatasız çalıştığını söyler
        }
    }
}