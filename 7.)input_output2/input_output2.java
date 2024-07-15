import java.util.Scanner;           //program to calculate hypotenuse
import static java.lang.System.out;   // Thanks to these, there is no need to write System when writing output-input
import static java.lang.System.in;

public class input_output2 {
    private static Scanner login;
    public static void main(String[] args){
        double a ;
        int b,c;
        out.println("please enter the edges");
        login=new Scanner(in);         //normally we would say system.in here
        b=login.nextInt();
        c=login.nextInt();
        a= Math.sqrt(b*b+c*c);
        out.println("hypotenuse :"+a);       // here is system.out
    }
}