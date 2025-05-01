public class Loops_5 {  // piramit döngüleri
    public static void main(String[] args) {

        // sayı piramidi
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //kare piramidi
        for (int i = 1; i < 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        // ters kare piramidi
        for (int i = 7; i > 0; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}