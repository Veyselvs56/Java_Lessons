public class Fonctions_4 {   //Method overloading =fonksiyon aşırı yüklenmesi
    static int toplam(int a, int b) {
        return a + b;
    }
    static double toplam(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(toplam(3, 5));
        System.out.println(toplam(3, 5, 7));
    }
    /* bir fonksiyon ismi ile birden fazla işlem hesaplamamıza yardımcı olur toplam fonksiyonu ile kullanıcı
     2 parametre girerse ilki 3 parametre girese ikinci fonksiyon çalışacaktır */
}
