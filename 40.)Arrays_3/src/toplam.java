import java.util.Scanner;       // meali =tarayıcı kullanımını içe aktar
public class toplam {      // random oluşturulan dizi elemanlarını toplayan program
    private static Scanner giris;     // meali özel global giris tarayıcısı tanımladık

    public static void main(String[] args) {
        giris =new Scanner(System.in);    //meali giriş değişkenini al ona sisteme Scanner giriş gibi davran
        int indis,Toplam=0;
        System.out.println("Dizi boyutu:");
        indis =giris.nextInt();  // giriş komutu ile değeri integer olarak indis'e ata
        int[] A =new int[indis];
        System.out.println("Dizi Elemanları:");

        for(int i = 0; i< indis; i++){
            A[i]=1+(int)(Math.random()*100); // 0. indisten itibaren random sayı oluştur ve diziye aktar
            System.out.println("A["+i+"]="+A[i]);
            Toplam=Toplam+A[i];
        }
        System.out.println("Toplam="+Toplam);
    }
}
