import static java.util.Arrays.sort;

public class sort_metod {

    public static void main(String[] args) {
        char[] A ={'i','s','t','a','n','b','u','l'};
        sort(A);   //A dizisini küçükten büyüğe doğru sıralıyır
        ///sıralı diziyi ekrana yaz
        //foreach ile
        for (char c : A) System.out.printf("%c ", c);  // dizideki her elemanı teker teker c değişkenine aktarır
        //foru böyle de yazabiliriz
        System.out.println();
        for(int i=0;i<A.length;i++)           //length= dizininin boyutudur
            System.out.printf("%c ",A[i]);

        //sıralı dizinin en küçük ve en büyük elemanın
        System.out.printf("\nEnk: %c\nEnb: %c",A[0],A[A.length-1]);
    }
}