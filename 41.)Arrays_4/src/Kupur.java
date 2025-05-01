import java.util.Scanner;
public class Kupur {     // GİRİLEN PARAYI EN AZ SAYIDA KÜPÜR İLE YAZAN PROGRAM
    private static Scanner giris;

    public static void main(String[] args) {
        int para, sayi;
        int[] K = {200, 100, 50, 20, 10, 5, 1};
        System.out.println("Para miktarını giriniz");

        giris = new Scanner(System.in);
        para = giris.nextInt();
        for (int i = 0; i <= 6; i++) { //önce ilk küpüre böldük sonra kaç tane ilk küpürden varsa paradan çıkardık
            sayi = (int) para / K[i];
            para = para - sayi * K[i];

            if (sayi != 0) {
                System.out.println(sayi + " adet " + K[i] + "TL");
            }
        }
        System.out.println("Vermelisiniz");
    }
}
