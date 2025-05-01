import java.util.Scanner;   //ismi girilen kişinin numarasını bulan program
public class TelefonNo {
    public static void main(String[] args) {
        /* iki boyutlu bir dizi tanımladık 1. sutunda isimler ikinci sutunda numaralar var sonra if bloğunda girilen
        isim ile dizideki isim eşitse önce isim sonra no ekrana yazılır daha fazla arama yapmasın diye break kullanılır
        sonra eğer i sayısı dizinin sonuna kadar gitmişse isim bulunamadı yazar */
        String[][] AdNo = {{"osman", "0505-378-1224"}, {"bayram", "0505-345-8712"}, {"elif", "0505-356-2456"}
                , {"ebubekir", "0555-314-0045"}, {"Ali", "0544-234-1450"}};

        int i;
        Scanner giris = new Scanner(System.in);
        System.out.println("Rehberde ara :");
        String girilen = giris.next();

        for (i = 0; i < AdNo.length; i++) {   // burda dizi uzunluğu 5 son indisimiz 4 olur yani sadece satırlar hesaplanır
            if (AdNo[i][0].equals(girilen)) {
                System.out.println(AdNo[i][0] + ": " + AdNo[i][1]);
                break;
            }
        }
        if (i == AdNo.length)
            System.out.println("İsim bulunamadı");
    }
}