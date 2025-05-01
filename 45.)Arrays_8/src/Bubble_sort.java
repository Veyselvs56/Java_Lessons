public class Bubble_sort {  // KABARCIK SIRALAMASI ALGORİTMASI
    final static int n=10;
    public static void main(String[] args) {
        int[]A={2,5,6,1,78,43,23,89,9,14};
        int i,j,enk;
        //Bubble sorta göre sıralama
        for(i=0;i<n;i++){             // büyükten küçüğe sıralam yapan algoritma
            for(j=i+1;j<n;j++){
                if(A[i]<A[j]){
                    enk=A[i];
                    A[i]=A[j];
                    A[j]=enk;
                }
            }
        }
System.out.println("sıralı hali:");
        for(i=0;i<n;i++)
            System.out.printf("%d ",A[i]);
    }
}
