public class sifir_kare_matris {
    public static void main(String[] args) {

        int i,j;
        int [][] A=new int [5][5];
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i==j)
                    A[i][j]=0;
                else if(i>j)
                    A[i][j]=-1;
                else
                    A[i][j]=1;
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
