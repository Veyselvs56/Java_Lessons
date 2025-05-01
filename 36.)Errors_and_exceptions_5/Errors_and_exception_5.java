public class Errors_and_exception_5 extends RuntimeException{    /*kendi istisna sınıflarımızı extends değimi
ile oluşturduk kendi istisna sınıflarımızı oluşturmak için önce bir istisna sınıf tanımlamak ve bu istisna sınıfın
örneğini oluşturmamız gerekiyor  */
    public Errors_and_exception_5(String a){
        super(a);   // üst sınıfa ait nesneleri çağırmaya yarar
    }

    public static void main(String[] args) {
// kullanıcı paydayı 0 girerse errorandexception5 istisna sınıf hatasını verecek yani kendi oluşturduğumuz sınıfı
        double pay=(int)(Math.random()*100.0);
        System.out.println("sayı 1:"+pay);

        double payda=(int)(Math.random()*2.0);
        System.out.println("sayı 2:"+payda);

        if(payda<=0){
            throw new Errors_and_exception_5("sayı 2 pozitif olmalı");
        }
        System.out.println(pay/payda);
    }
}
