import java.util.Scanner;
import java.util.Arrays;     //import static ... arrays.sort yazsaydık aşağıda arrays .sort yazmamıza gerek kalmazdı
// fonksiyonlar ile binary ve sort aramasını yapan uygulama
public class sort_and_binary {
static int[]A={2,13,4,6,17,12,34,67,89};
private static Scanner ara;

    public static void main(String[] args) {
        Arrays.sort(A);    //dizi sıralama fonksiyonu
        System.out.println("sıralı dizi: ");
        for(int dizi:A) { // foreach döngüsü ile ekrana yazdık
            System.out.printf("%d ",dizi);
        }
        System.out.print("\nAranan sayi:");
        ara=new Scanner(System.in);
        int aranan=ara.nextInt();
        int b=Arrays.binarySearch(A,aranan);  // ikili arama yaptık

        if(b>=0)   // burda >= dememizin sebebi b değeri 0 da olabilir
            System.out.printf("Aranan %d. sırada bulundu",b);
        else
            System.out.println("Aranan bulunamadı");
    }
}