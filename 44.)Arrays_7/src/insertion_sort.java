public class insertion_sort {      // ARAYA EKLEME SIRALAMASI
    final static int n = 10;
    public static void main(String[] args) {
        int[] A = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
        int i, ekle;
        //instertion sorta göre sıralama
        for (i = 1; i < n; i++) {

            ekle = A[i];
            while (i > 0 && (A[i - 1] < ekle)) {

                A[i] = A[i - 1];
                i = i - 1;
            }
            A[i] = ekle;
        }
        System.out.print("Sıralı hali:");
        for (i = 0; i < n; i++)
            System.out.printf("%d ", A[i]);
    }
}
