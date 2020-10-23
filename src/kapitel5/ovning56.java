package kapitel5;
import javax.swing.*;

public class ovning56 {
    public static void main (String[] args) {
        String s = JOptionPane.showInputDialog("Skriv en text?");
        int i;
        int length = s.length() - 1;
        for (i=length ; i >= 0 ; i--){
            if (s.charAt(i) == ' ' || s.charAt(i) == '\t') {
                break;
            }
        }
        if (i >= 0){
            i++;
            JOptionPane.showMessageDialog(null, "Första vita tecken finns på plats nr " + i);
        }else{
            JOptionPane.showMessageDialog(null, "Inga vita tecken");
        }
    }
}
