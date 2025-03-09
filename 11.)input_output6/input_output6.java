import javax.swing.JOptionPane;

public class input_output6 {
    public static void main(String[] args){
        // Seçenekler string bir dizide tutuluyor
        String[] secenekler ={"Evet","Hayır","Bir dakika"};   // seçenekleri bir diziye tanımladık
        String mesaj ="kahve içer misini ?";  //mesaj bizim sorumuz olacak

        int secim =JOptionPane.showOptionDialog  // seçenekleri bizim belirlememize yarar option=seçenek
         (null,mesaj,"seçenekler",2,2,null,secenekler,null);

        JOptionPane.showMessageDialog(null,secenekler[secim]);  // seçtiğimiz seçimi ekrana yazar
    }
}