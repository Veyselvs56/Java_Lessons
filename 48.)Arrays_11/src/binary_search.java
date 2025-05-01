import java.util.Scanner;
public class binary_search {
    static int[] A={2,3,4,6,7,12,34,67,89};
    static int binary_Search(int[] A,int N,int ara){

        int orta,alt=0,ust=N-1;
        while(alt <=ust){

            orta=(alt+ust)/2;
            if(ara>A[orta])
                alt=orta-1;
            else if(ara<A[orta])
                ust=orta-1;
            else return 1;

        }
        return 0;
    }
    public static void main(String[] args) {
        int aranan,sayac=0;

        System.out.println("Aranan sayi: ");
        aranan= new Scanner(System.in).nextInt();   // eğer aranan değişkenini yukarda tanımlamazsak bu şekilde yazmamız gerekir
        sayac=binary_Search(A,9,aranan);
        if(sayac==1)
            System.out.println("Aranan bulundu");
        else
            System.out.println("aranan bulunamadı ");
    }
}