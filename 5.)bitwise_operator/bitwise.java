public class bitwise {  // These are operators that perform logical operations on individual bits in binary
    public static void main(String[] args) {
        int b=1, c=5;
        int d=b&c;      // and
        int e=b|c;      // or
        int f=c>>1;    // Swipe right according to the number of digits you typed
        int g=c<<2;   // Slide to the left
        System.out.println("b ="+b);
        System.out.println("c ="+Integer.toBinaryString(c));
        System.out.println("b&c ="+Integer.toBinaryString(d));
        System.out.println("b|c ="+Integer.toBinaryString(e));
        System.out.println("c>> ="+Integer.toBinaryString(f));
        System.out.println("c<< ="+Integer.toBinaryString(g));
    }
}