public class input_output7 {  // format ve printf yazımları
    public static void main(String[] args) {
        int a=13;
        System.out.printf("%.3f\n",(float)a); //13,00   %f float formatinda gösterir
        System.out.printf("a=%d\n",a);    //a=13  // %d integer formatinda gösteriri
        System.out.printf("a=%X\n",a); //a=D  //%X hexadecimal formatta gösterir
        System.out.printf("%c%n",'A'); //A %c tek bir karakter ekrana basar yani char
        System.out.printf("%s%n","bade"); //bade //%s ekrana string yazar //%n = \n ye
        System.out.format("%.3f\n",(float)a); //13,000  // %.3f virgülden sonraki basamak sayısını ayarlar
        System.out.format("%04d%n",a); //0013  //sayıyı 4 basamakta yazar ilk başa 0 koyar
        System.out.format("%f%n",Math.PI); //3,141593
        System.out.format("%.3f%n",Math.PI); //3,142 // virgülden sonrayı 3 basamak yapar
        System.out.format("%11.5f%n",Math.PI); //   3,1416 mod işaretinden sonraki sayı öne boşluk bırakmayı sağlar
    }
}