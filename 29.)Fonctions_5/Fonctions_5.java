import java.util.Scanner;       // özyineleme ile faktöriyel hesaplayan program
public class Fonctions_5 {
    private static Scanner giris;
    static int fakt(int n) {
        if (n == 0 || n == 1)    // öz yineleme için referans vermemiz lazım
            return 1;
        else
            return (n * fakt(n - 1));
    }

    public static void main(String[] args) {
        int n;
        giris = new Scanner(System.in);
        System.out.print("Sayı :");
        n = giris.nextInt();
        System.out.println(n + "! = " + fakt(n)); //yada
        System.out.printf("%d! = %d", n, fakt(n));   // bu şekilde yazılabilir
    }
}
