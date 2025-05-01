public class transpoze {    // bir matrisin transpozesini alan program
    public static void main(String[] args) {
// satırları ve sütünları değiştirdik
        int j,i;
        //A[3][4] matrisinin elemanları
        int [][] A={{0,1,2,3},{4,5,6,7},{8,9,0,4}};
        int [][] B=new int [4][3]; // transpoze matrisin boyutu
        System.out.print("A matrisi.:\n");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.printf("%d ",A[i][j]);
                // A matrisinin trasnpozesi
                B[j][i]=A[i][j];  // A nın satırlarındaki değerler tek tek B nin sütünlarına yazılacak
            }
            System.out.println();;
        }
        System.out.print("\nB matrisi..:\n");
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.printf("%d ",B[i][j]);
            }
            System.out.println();
        }
    }
}