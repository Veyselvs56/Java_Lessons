public class kare_birim_matris {     // kare birim matris yazdıran program

    public static void main(String[] args) {

        int [][] A=new int [5][5];
        for(int i=0;i<5;++i){
            for(int j=0;j<5;++j){
                if(i==j)
                    A[i][j]=1;
                else
                    A[i][j]=0;
                System.out.print(A[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
