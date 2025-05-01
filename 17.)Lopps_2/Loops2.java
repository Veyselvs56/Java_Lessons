import java.util.Arrays;

public class Loops2 {      //FOREACH döngüsü
    public static void main(String[] args) {
         //forEach döngüsü
        var liste = Arrays.asList(0, 1, 2, 3);   //bir liste tanımladık ve içindeki değerleri listeye gönderdik asList statik listedir
        for (int sayi : liste) {                   // burda listedeki değerleri tek tek sayi ya aktarır sonra yazdırır
            System.out.println(sayi);
        }
            System.out.println();
        //forEach metodu örneği
        var liste2 = Arrays.asList(4, 5, 6, 7);    // tanımladığımız listeyi liste2 ye atadık sonra
        liste2.forEach(sayi2 -> System.out.println(sayi2));  // forEach metodu ile sayi2 deki adresten yazdırdık

        //yada
        liste2.forEach(System.out::println);  //yazıp liste elemanlarının direkt alt alta yazılmasını sağlayabiliriz

        //klasik for ile yaparsak koşul yerine liste2.size() yazıp uzunluğu bulabiliriz
        //var anahtar kelimesi değişken türünü belirlemeden tanımlama yapmamıza yarıyor
    }
}