public class Main {   // TYPE CONVERSIONS
    public static void main(String[] args) {

        int number=0b1100;
        String octal=Integer.toOctalString(number);  //converted from binary to octal system
        System.out.println("(1100)8="+octal);

        String hexadecimal=Integer.toHexString(number);   //number conversion from binary to hexadecimal
        System.out.println("(1100)16="+hexadecimal);

        String decimal=Integer.toString(number);          //number conversion from binary to decimal
        System.out.println("(1100)10="+decimal);

        //binary to decimal conversion alternative
        int binary_decimal=Integer.parseInt("1100",2);  // radix for example base ten
        System.out.println("(1100)10="+binary_decimal);
    }
}