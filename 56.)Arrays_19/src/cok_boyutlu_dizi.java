public class cok_boyutlu_dizi {  // 3 ders için random öğrenci notlarını hesaplayan program
    public static void main(String[] args) { //tablo[satır][sutun][matrissayısı] olur

        double ort;
        double[][][] tablo = new double[10][7][3];

       // 3 ders için 3 for
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i <= 9; i++) {
                tablo[i][0][k] = i + 1;    // öğrenci numaraları 1. satıra yazılıyor
                for (int j = 1; j <= 5; j++) {    // rast gele notları üretiyoruz 1 den başlıyoruz çünkü 0. indise numaralar yazılı
                    tablo[i][j][k] = 1 + (int) (Math.random() * 100);
                    // ortalama hesaplama formülü
                    ort = (((tablo[i][1][k] * 15) + (tablo[i][2][k] * 15) + (tablo[i][3][k] * 20) + (tablo[i][4][k] * 50)) * 0.3 / 100 + (tablo[i][5][k] * 70) / 100);
                    tablo[i][6][k] = Math.round(ort);   // ortalama değerini yuvarladık
                }
            }
        }

        for (int k = 0; k < 3; k++) {
            System.out.printf("%d. dersin notu:\n",k+1);
            System.out.println(" No   " + "\t" + " KS-1" + "\t" + " KS-1\t" + " ödev\t" + " Vize\t" + " Final\t" + " Başarı notu");
            System.out.println(" ====\t ====\t ====\t ====\t ====\t ====\t ====");
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 6; j++) {
                    System.out.print(" " + (tablo[i][j][k]) + "\t");
                }
                System.out.println();
            }
        }
    }
}