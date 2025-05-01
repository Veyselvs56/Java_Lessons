public class Main {         // for ile dizide değer aramak (lineer arama)
    public static void main(String[] args) {
        int[] sayi = new int[]{1, 2, 3, 4, 5};
        int aranan_sayi = 5;
        for (int bulundu : sayi) {
            if (bulundu == aranan_sayi) {
                System.out.printf("aranan sayi %d . adreste bulundu ", sayi[bulundu-1]);
            }
        }
    }
}
