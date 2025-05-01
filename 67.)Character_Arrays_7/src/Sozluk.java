import java.util.Scanner;
public class Sozluk {
    private static Scanner giris;
    public static void main(String[] args){

        String[] tr={"ilkbahar","yaz","Sonbahar","kış"};
        String[] eng={"Spring","Summer","autumn","winter"};
        String mevsim;
        int sayac=0;
        giris=new Scanner(System.in);
        System.out.println("türkçe mevsimi girin:");
        mevsim=giris.next();
        for(int i=0;i<tr.length;i++){
            if(mevsim.equalsIgnoreCase(tr[i])) {   // bu metot mevsim değişkenini küçük harfe çevirir ve içindeki parametre
                //ile kontrol eder 
                System.out.printf("ingilizcesi:%s", eng[i]);
                sayac = 1;
                break;
            }
        }
        if(sayac==0)
            System.out.println("bu kelime sözlükte yoktur");
    }
}