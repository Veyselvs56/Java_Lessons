import java.util.Random;
public class Random_number_2 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            Random rnd=new Random();       //rnd isimli bir nesne ürettik
            /* altta rnd nin aldığı değeri 70 ile 7 arasında tuttuk */
            int number=7+rnd.nextInt(70);   // bound=bağlı,zorunlu
            System.out.println(i+1+". sayı="+number);
        }
        System.out.println("\nfloat sayılar\n");   // float random sayı üretme
        for(int i=0;i<7;i++){
            Random rnd=new Random();       //rnd isimli bir nesne ürettik
            float number=7+rnd.nextFloat(70);     // rnd ye parametre olarak float verdik sadece
            System.out.println(i+1+". sayı="+number);
        }
    }
}