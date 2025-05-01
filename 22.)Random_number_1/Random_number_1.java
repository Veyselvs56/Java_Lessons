import java.util.Scanner;  // 1 VE 6 ARASINDA HANGİ SAYIDAN KAÇ TANE ÜRETİLDİĞİNİ BULAN PROGRAM
public class Random_number_1 {
    public static void main(String[] args) {

        int zar,bir=0,iki=0,uc=0,dort=0,bes=0,alti=0;
        System.out.print("kaç tane rastgele sayı üreteceksiniz :");
        int number= new Scanner(System.in).nextInt();
        for(int i=0;i<number;i++){
            zar =(int)(Math.random() * 6)+1;  // 1-6 arasında integer tipinde sayı üretiliyor ve zara atanıyor
            switch (zar) {
                case 1 -> bir++;
                case 2 -> iki++;
                case 3 -> uc++;
                case 4 -> dort++;
                case 5 -> bes++;
                case 6 -> alti++;
            }
            System.out.println(zar);
        }
        System.out.println(bir+" tane bir ");
        System.out.println(iki+" tane iki ");
        System.out.println(uc+" tane uc ");
        System.out.println(dort+" tane dort ");
        System.out.println(bes+" tane bes ");
        System.out.println(alti+" tane alti ");
    }
}