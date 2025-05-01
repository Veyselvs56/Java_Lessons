import java.util.Scanner;
public class ROT_13 {/* klaviyede girilen her harfi sayı içermiyecek şekilde o harften sonra 13 harf atlıyarak
bazen z den a ya atlıyarak şifreleyen program */
    public static void main(String[] args){

        Scanner giris=new Scanner(System.in);
        System.out.println("kelime..: ");
        String kelime=giris.nextLine();   // türkçe karakter kullanmadan
        System.out.println("Şifrelenmiş hali..:");

        for(int i=0;i<kelime.length();i++){
            char harf =kelime.charAt(i);   // charAt string ifadede belirtilen değeri döndürür
            if(harf >='a'&& harf <='m')  harf +=13;
            else if(harf >='A'&& harf <='M')  harf +=13;
            else if(harf >='n'&& harf <='z')  harf -=13;
            else if(harf >='N'&& harf <='Z')  harf -=13;
            System.out.print(harf);
        }
    }
}