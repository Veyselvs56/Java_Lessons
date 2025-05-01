public class Ogrencinot {  // random öğrenci notlarını tabloya yazan dizi
    public static void main(String[] args) {

        double ort;
        double[][] tablo = new double[10][7];

        for (int i = 0; i <= 9; i++) {
            tablo[i][0] = i + 1; // öğrenci numaraları 1. satıra yazılıyor
            for (int j = 1; j <= 5; j++) {  // rast gele notları üretiyoruz 1 den başlıyoruz çünkü 0. indise numaralar yazılı
                tablo[i][j] = 1 + (int) (Math.random() * 100);
            }
// ortalama hesaplama formülü
            ort = (((tablo[i][1] * 15) + (tablo[i][2] * 15) + (tablo[i][3] * 20) + (tablo[i][4] * 50)) * 0.3 / 100 + (tablo[i][5] * 70) / 100);
            tablo[i][6] = Math.round(ort);   // ortalama değerini yuvarladık
        }
        System.out.println(" No   " + "\t" + " KS-1" + "\t" + " KS-1\t" + " ödev\t" + " Vize\t" + " Final\t" + " Başarı notu");
        System.out.println(" ====\t ====\t ====\t ====\t ====\t ====\t ====");

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(" " + (tablo[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
