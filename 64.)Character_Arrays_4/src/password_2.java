import java.util.Scanner;       // giriş haklı parola doğrulama kdou

public class password_2 {

    public static void main(String[] args) {
        int sayac = 0;
        String parola = "java";
        Scanner gir = new Scanner(System.in);
        do {
            System.out.print("parolayı girin lütfen: ");
            String girilen = gir.next();
            if (parola.equals(girilen)) {      // yada parola.compereTo(girilen)==0
                System.out.println("parolayı bildiniz ");
                break;
            }
            sayac++;
        } while (sayac < 3);
        if (sayac >= 3)
            System.out.println("hatalı bir parola girdiniz ve giriş hakkınız doldu ");
    }
}