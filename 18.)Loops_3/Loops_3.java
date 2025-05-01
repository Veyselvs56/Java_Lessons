import java.util.Scanner;     //while ile faktöriyel hesaplayan program
public class Loops_3 {
    public static void main(String[] args) {

        int n ,fakt=1;
        System.out.print("Sayı=");
        Scanner giris =new Scanner(System.in);
        n=giris.nextInt();
        int i=n;

        while (i>=1){
            fakt=fakt*i;
            i=i-1;
        }
        System.out.println(n+"!="+fakt);
    }
}