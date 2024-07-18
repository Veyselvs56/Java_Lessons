import javax.swing.JOptionPane;   // used for data entry from the form screen

public class input_output3 {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"are you sure?","warning",3);
        //Instead of the number 3, we can write JOptionPane.QUESTION_MESSAGE
        JOptionPane.showMessageDialog(null,"are you sure?","warning",JOptionPane.WARNING_MESSAGE );
        // WARNİNG_MESSAGE=2
        // 1 =INFORMATION_MESSAGE
        // 0= ERROR_MESSAGE
        // -1=no icon ==PLAIN_MESSAGE
    }
}