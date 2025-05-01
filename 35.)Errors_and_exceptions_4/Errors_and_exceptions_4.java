import java.util.Scanner;
public class Errors_and_exceptions_4 {
// payda 0 girilirse yanlış argüman hatası oluşturacak kullanıcıya iletilecek
    static Scanner giris=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("1. sayı :");
        double pay =giris.nextInt();

        System.out.print("2. sayı :");
        double payda =giris.nextInt();

        if(payda==0){
            throw new IllegalArgumentException("payda sıfır olamaz ");
        }
        System.out.println(pay/payda);
    }
}
