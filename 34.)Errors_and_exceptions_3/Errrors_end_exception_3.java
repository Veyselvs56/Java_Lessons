import java.util.Scanner;
public class Errrors_end_exception_3 {
    static Scanner giris = new Scanner(System.in);

    public static void main(String[] args) { //13. kata çıktığında hata veren onun dışındakileri yazdıran prog.
        System.out.println("hangi kata çıkacaksınız ?");
        int i = giris.nextInt();

        if (i == 13) {
            throw new ArithmeticException("bu kata çıkmak yasak");    //throw =atmak yani kullanıcıya bu hatayı gösteriyoruz
        } else {
            System.out.println(i + ". kata çıkıldı");
        }
    }
}