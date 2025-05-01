import javax.swing.JOptionPane;    // for ile faktöriyel hesaplayan program
public class Loops1 {
    public static void main(String[] args) {
        int n, fakt = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "sayıyı girin lütfen"));
          // girilen sayıyı integer yapıp n ye atadık
        for (int i = 1; i <= n; i++) {
            fakt = fakt * i;
        }
        JOptionPane.showMessageDialog(null, n + "!=" + fakt);
    }
}