import java.util.Scanner;       //input-output library

public class input_output {
    public static void main(String[] args){
        //nextInt()   = Converts the expression entered from the keyboard to integer type
        //nextFloat() = Converts the expression entered from the keyboard to decimal number type
        //nextDouble()= Converts the expression entered from the keyboard to long decimal number type
        //next()      = Reads the expression entered from the keyboard and takes the part up to the space character
        //nextLine()  = reads the entire line entered from the keyboard
        //next().charAt(0)= It reads the first character of the expression entered from the keyboard. If we write 1 instead of 0, it reads the 2nd character.
        char a= new Scanner (System.in).next().charAt(0);
        System.out.println(a);

        float C;
        System.out.println("enter the fahrenheit value\n ");
        int F= new Scanner(System.in).nextInt(); /*sWe derived an object from the canner class and assigned it to f
         We could write them separately, first create an object and then call that object.*/

        C=(float)((F-32)/1.8);           // fahrenheit celcius conversion
        System.out.printf("Sıcaklık: %.2f",C);
    }
}