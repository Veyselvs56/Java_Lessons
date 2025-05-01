import java.util.Scanner;
public class Loops_6 {   // pascal üçgeni
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pascal Üçgeninin satır sayısını girin: ");
        int satir = scanner.nextInt();

        // Pascal üçgenini oluştur
        int[][] pascal = new int[satir][satir];

        for (int i = 0; i < satir; i++) {
            // Üçgeni piramit şeklinde ortalamak için gerekli boşluklar
            for (int j = 0; j < satir - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                // Değerleri yazdırma
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println(); // Yeni satıra geç
        }
        scanner.close();
    }
}



