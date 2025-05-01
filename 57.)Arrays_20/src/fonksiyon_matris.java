public class fonksiyon_matris {
    final static int N = 2;

    // f1 e parametre olarak dizi elemanlarını aktardık
    static void f1(int[] V) {
        V[1] = 2;
    }

    //f2 ye parametre olarak matris elemanları aktarıldı
    static void f2(int[][] M) {
        M[0][0] = 4;
        M[1][0] = 8;
    }

    public static void main(String[] args) {
        int[][] A = new int[N][N];
        
        f1(A[0]);   // prametre olarak dizi
        f2(A);  // parametre olarak a matrisi
        System.out.printf("\n%d\t%d", A[0][0], A[0][1]);
        System.out.printf("\n%d\t%d", A[1][0], A[1][1]);
    }
}
