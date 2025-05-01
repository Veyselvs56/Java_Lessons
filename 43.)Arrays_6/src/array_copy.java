public class array_copy {     //A DİZİSİNİ B YE TERSTEN KOPYALAYAN PROG.
    public static void main(String[] args) {
        char[] A ={'a','b','c','d','e','f','g','h','i','j'};
        char[] B=new char[10];    //10 boyutlu bir dizi tanımladık

        System.out.print("B[10]=");
        for(int i=0;i<=9;i++){
            B[i]=A[9-i];     // a yı b ye tersten kopyalıyor
            System.out.printf("\t%c",B[i]);
        }
    }
}