import java.util.Scanner;      //switch case örneği
public class selection_structures3 {
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz:");
        int note = new Scanner(System.in).nextInt();
        switch (note / 10) {  // burda yaptığımız şey girilen notu integer değerinde olduğu için rakam
            // olarak gösterecektir yani 89/10=8 olacaktır
            case 10:   // 100 ve 90 aralığı AA
            case 9:
                System.out.print("AA");  break;
            case 8:
                System.out.print("BA");  break;
            case 7:
                System.out.print("BB");  break;
            case 6:
                System.out.print("CB");  break;
            case 5:
                System.out.print("CC");  break;
            default:
                System.out.print("FF");  break;
        }  // switch case de float ve double türünde değişken kullanılmaz
        // programın eksiği 100 den büyük değer girilirse ff gösterecek
    }
}