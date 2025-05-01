public class matris {     // ekrana çarpma operatörü ile x yazdıran program
    public static void main(String[] args) {
         // satırların ve sutunların eşit oldukları yerlere ve toplamlarının 4 oldukları yerlere * yazdırdık
        char [][] A=new char[5][5];
        for(int satir=0;satir<5;satir++){
            for(int sutun=0;sutun<5;sutun++){
                if(satir==sutun || (satir+sutun)==4)
                    A[satir][sutun]='*';
                else
                    A[satir][sutun]=' ';
                System.out.printf("%2c",A[satir][sutun]);
            }
            System.out.print("\n");
        }
    }
}
