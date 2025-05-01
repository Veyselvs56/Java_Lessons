import java.util.Scanner;
public class Fonctions_6 {  // ackermann fonksiyonu
    /*çalışma şekli böyle ancak 3 ,4 sayılarından sonra hata veriyor mantığını anlamak yeterli
A(m,n)=  n+1               if m=0
         A(m-1,1)          if m>0 and n=0
         A(m-1,A(m,n-1))   if m>0 and n>0
    */
    private static Scanner giris;
    static double ackerman(int a, double b) {
        if (a == 0) {
            return (b + 1);
        } else if (a > 0 && b == 0) {
            return ackerman(a - 1, 1);
        } else if (a > 0 && b > 0) {
            return ackerman(a - 1, ackerman(a, b - 1));
        }
        else
        return 0;
    }
    public static void main(String[] args) {
        giris = new Scanner(System.in);
        System.out.print("sayı 1:");
        int a = giris.nextInt();
        System.out.print("sayı 2:");
        int b = giris.nextInt();
        System.out.println("A(" + a + "," + b + ")=" + ackerman(a, b));
    }
}