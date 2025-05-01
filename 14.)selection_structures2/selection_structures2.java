import java.util.Scanner;
public class selection_structures2 { // girilen yaşa göre if else dallanan yapı
    private static Scanner giris;
    public static void main(String[] args) {
        int yas;
        System.out.println("yaşınızı girin lütfen");
        giris = new Scanner(System.in);
        yas = giris.nextInt();
        if (yas <= 2)
            System.out.println("bebeklik");
        else if (yas <= 12)
            System.out.println("çocukluk");
        else if (yas <= 18)
            System.out.println("ergenlik");
        else if (yas <= 39)
            System.out.println("gençlik");
        else if (yas <= 63)
            System.out.println("yetişkinlik");
        else
            System.out.println("yaşlılık");
    }
}
