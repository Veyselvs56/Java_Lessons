public class Cumle_say {   //yazılan metindeki cümle sayısnı "." ya göre bulan program
    public static void main(String[] args) {
        String metin = "Gözler boştu donuktu." + "Sözler anlamsızdı soğuktu." + "Belli ki buradan kopmuştu";
        String[] cumle = metin.split("[.]");   //regex=ifade split bir kritere göre cümle ayırır
        int i = 0;
        for (String x : cumle) {
            i += 1;
            System.out.println(x);
        }
        System.out.println("cümle sayısı..: " + i);
    }
}