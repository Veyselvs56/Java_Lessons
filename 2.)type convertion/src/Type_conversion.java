public class Type_conversion {   //WE CONVERTED STRING VALUES TO OTHER TYPES
    public static void main(String[] args) {

        byte b = Byte.parseByte("8");
        short s = Short.parseShort("16");
        int i = Integer.parseInt("42");
        long L = Long.parseLong("555");
        float f = Float.parseFloat("4.20");
        double d = Double.parseDouble("99.99");
        boolean b2 = Boolean.parseBoolean("true");

        System.out.println(b + s + i);  //66
        System.out.println(d + f + L);  //659.19
        System.out.println("b2= " + b2);  //66

        //we converted other types to string type
        String a = Float.toString(18);
        String a2 = String.valueOf(18);
        //both work the same
        System.out.println(a  + a2);     // addition operation just writes these string values side by side
    }
}