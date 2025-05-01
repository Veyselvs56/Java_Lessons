public class character_arrays {       // String dizilerini yazma versiyonları
    public static void main(String[] args) {
        char[] kA={'J','a','v','a','\0'};    //   \0=null

        System.out.println(kA[0]);  //J
        System.out.println(kA[4]);
        System.out.println((int)kA[4]);  //ascıı olarak yazar
        String kA2="Java";
        //println(kA2[0]==hatalı erişim
        System.out.println(kA2.charAt(0));  //J  indis değerini yazar
        System.out.println(kA2.charAt(3));  //a


        String ad="İskenderun";
        System.out.println("0123456");
        System.out.println(ad);      // normal kullanım
        System.out.printf("\n%s",ad);      // formatlı kullanım
        System.out.printf("\n%.3s\n",ad);  // ilk üç karakteri yazdıracak
        System.out.println(ad.charAt(5));  // 5. karakteri yazacaktır
        System.out.println(ad.substring(3));  //3 ten sonrasını yazar begin=başlamak
        System.out.println(ad.length());  // karakter uzunluğunu yazar

        for(int i=0;i<ad.length();i++){
            System.out.printf("%c-",ad.charAt(i));  // tüm karakterleri döngü ile yazar
        }
    }
}