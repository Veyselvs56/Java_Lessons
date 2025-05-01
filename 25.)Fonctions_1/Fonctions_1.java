import java.util.Scanner;
import static java.lang.System.out;   // bunlar sayesinde çıktı-girdi yazarken System yazmaya gerek kalmaz
import static java.lang.System.in;

public class Fonctions_1 {
    static int enb(int s1, int s2, int s3) {    // enbüyük sayıyı hesaplayan fonksiyon
        return Math.max(Math.max(s1, s2), s3);
    }

    static int enk(int s1, int s2, int s3) {  // eğer static ön eki olmasaydı class ismi bir nesneye aktarılıp nesne
        return Math.min(Math.min(s1, s2), s3);    // ismiyle çağırılabilirdi
    }

    private static int zisan=10;
    public static void main(String[] args) {
        Scanner giris; // yerel değişken olarak yazdık global yazmak için main dışında private static ön eki eklenirdi
        int s1 = 0, s2, s3;

        out.println("lütfen sayıları giriniz");
        giris = new Scanner(in);   //  java lang kütüphanesi sayesinde system yazmadık

        out.print("1. sayi =");
        s1 = giris.nextInt();
        out.print("2. sayi =");
        s2 = giris.nextInt();
        out.print("3. sayi =");
        s3 = giris.nextInt();

        out.println("en büyük sayi=" + enb(s1, s2, s3));
        out.println("en küçük sayi=" + enk(s1, s2, s3));
        out.println(zisan);

    }
}