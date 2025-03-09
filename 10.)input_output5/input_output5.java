import javax.swing.JOptionPane;
public class input_output5 {
    public static void main(String[] args){
        System.out.println("Veysel bey;");
        int sonuc =JOptionPane.showConfirmDialog  //puts a checkbox on the screen
         (null,"Would you like some coffee?","order",JOptionPane.YES_NO_OPTION);

        System.out.println((sonuc==JOptionPane.YES_NO_OPTION)?"yes please":"No thanks ");

        System.out.println(JOptionPane.NO_OPTION);

       // -1=JOptionPane.DEFAULT_OPTİON
        //0=.YES_NO_OPTİON
        //1=YES_NO_CANCEL_OPTİON
        //2=OK_CANCEL_OPTİON

        //to get the return value of the user's consent
        //JOptionPane.OK_OPTİON== user pressed the OK button
        //.YES_OPTİON== user pressed the YES button
        //.NO_OPTİON== user pressed the NO button
        //.CANCEL_OPTİON== user pressed the CANCEL button
        //.CLOSE_OPTİON== user closed the dialog window
    }
}