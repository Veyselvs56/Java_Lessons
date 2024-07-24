import javax.swing.JOptionPane;   // program that performs 4 operations with the entered numbers
public class input_output4 {
    public static void main(String[] args){
        String line;
        float s1,s2;
        double addition, subtraction, multiplication, division;
        s1=Float.parseFloat(JOptionPane.showInputDialog("Number_1="));  // we received input from the user
        s2=Float.parseFloat(JOptionPane.showInputDialog("Number_2="));  // And we converted it to float. If we don't convert it, it will remain as a string.
        addition=s1+s2;
        subtraction=s1-s2;
        multiplication=s1*s2;
        division=s1/s2;

        line="";
        line=s1+"+"+s2+"="+addition+"\n"+
                s1+"-"+s2+"="+subtraction+"\n"
                 +s1+"/"+s2+"="+division+"\n"
                   +s1+"*"+s2+"="+multiplication+"\n";

        JOptionPane.showMessageDialog(null,line,"Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}