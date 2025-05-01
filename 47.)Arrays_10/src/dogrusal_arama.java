import java.util.Scanner;
public class dogrusal_arama{   // DOĞRUSAL ARAMA YAPAN PROGRAM
    private static Scanner ara;

    public static void main(String[] args) {
        int [] A={12,3,5,8,9,1,34,65,7,88};

        int i,aranan,sayac = 0;

        System.out.print("aranan sayi= ");
        ara=new Scanner(System.in);           // giriş nesnemizi oluşturduk
        aranan=ara.nextInt();              // nesnemiz ile giriş değerini aldık ve arana değişkene atadık
        // doğrusal arama algoritması
        for(i=0;i<10;i++){                  // her indisi aranan değer ile karşılaştırdık
            if(aranan==A[i]){
                System.out.printf("%d. sırada bulundu",i+1);
                sayac=1;   break;                 // eşitse döngü kırılacak ve bir sonraki değerler kontrol edilmiyecek
            }
        }
        if(sayac==0)
            System.out.print("Aranan bulunamadı.");
    }
}