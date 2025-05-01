public class diziden_fonksiyona {
    static final int mevcut=15;           // final anahtar kelimesi ile tanımlanan değişkenlere sadece bir kere atama yapılır
    static void notAl(int[] NT){
        for(int i=0;i<mevcut;i++){ // 15'e kadar 1 ve 100 arasında random sayılar oluşacak ve bunlar diziye aktarılacak
            NT[i]=1+(int)(Math.random()*100);
            System.out.printf("\n%d",NT[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("===Ders Basari Durumu====");
        int i,kalan=0,gecmenotu=50;

        int[] Not =new int[mevcut];        // not isimli bir dizi tanımladık bunun boyutunu da mevcut adedi olarak belirledik
        System.out.print("Notlar..:");
        notAl(Not);      // not dizisini parametre olarak not al fonksiyonuna gönderdik
        for(i=0;i<mevcut;i++){
            if(Not[i]<gecmenotu)    
                kalan++;
        }
        System.out.printf("\nKalanlar.:%d",kalan);
        System.out.printf("\nGecenler..:%d",mevcut-kalan);
    }
}