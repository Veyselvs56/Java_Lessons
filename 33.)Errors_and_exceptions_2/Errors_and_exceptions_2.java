import java.util.InputMismatchException;
import java.util.Scanner;
public class Errors_and_exceptions_2 {
/*girilen tam sayının karesini alan program ancak girilen sayı tam sayı değilse
* yani istenen değer girilmedi hata komutu çalışacak catch bloğu çalışacaktır yani tekrar giriş
* değeri alacaktır ve kullanıcı tam sayı girene kadar devam edecektir
 */
    static Scanner giris=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("bir sayı giriniz ");
        int i=TamsayiAl();
        System.out.println("karesi..:"+i*i);
    }
    public static int TamsayiAl(){
        while (true){
            try{
                return giris.nextInt();   // girilen sayı tam sayı değilse catch çalışacak
                // tam sayı olursa değer döndürüp döngüden çıkacak
            }
            catch (InputMismatchException hata1){   // kullanıcı tam sayı girmezse bu hata algılanacak
                giris.next();
                System.out.println("lütfen bir tam sayı giriniz\ntekrar deneyiniz ");
            }
        }  //sonsuz döngü
    }
}