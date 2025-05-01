import java.util.Scanner;    // parçalı fonksiyon hesaplayan program
public class selection_structures1 {
    private static Scanner gir;
    public static void main(String[] args) {
        System.out.println("sayıyı girin lütfen");
        gir = new Scanner(System.in);
        double X= gir.nextFloat();
        double f = 0;
        if (X <= 0)
            f = Math.pow(X, 2) + 1; // karesini al 1 ekle
        if (X >= 1)
            f = X;        // sayının kendisini yaz
        if (X > 0 && X < 1)
            f = Math.sqrt(X);         // kökünü al
        System.out.println(f);
        double  a=Math.sqrt(0.5);
        System.out.println();
        System.out.printf(String.valueOf(a)); //string olarak ekrana yazdık
    }
}