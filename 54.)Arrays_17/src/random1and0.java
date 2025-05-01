import java.util.Scanner;

// kare matriste oluşan random 1 ve sıfırların sayısını bulan program
public class random1and0 {
    public static void main(String[] args) {

        int j, i, N, sayac0 = 0, sayac1 = 0;
        System.out.println("N değerini girin lütfen:");

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        System.out.println();
        
        int[][] A = new int[N][N];

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                A[i][j] = (int) (Math.random() * 2); // sayıların 2 ye bölümünden kalan ya 0 yada 1 dir bu yüzden 1 ve 0 oluşur
                if (A[i][j] == 0)
                    sayac0++;
                else
                    sayac1++;
                System.out.printf("%d \t", A[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\n1 lerin sayısı: %d\n", sayac1);
        System.out.printf("\n0 lerin sayısı: %d\n", sayac0);
    }
}
