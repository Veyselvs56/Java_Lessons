public class Oruntu {
    public static void main(String[] args) {

        int[] zisan =new int [12];   // java da dizi tanımlama şekli
        for(int i=0;i<12;i++){
            if(i<6)
                zisan[i]=i;      // indis 6 dan küçükse indis değerini alsın
            else
                zisan[i]=11-i;  //değilse 5 ten sonra azalmasını sağlar
            System.out.print(zisan[i]+" ");
        }
    }
}
