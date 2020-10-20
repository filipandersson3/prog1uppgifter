package kapitel5;
import javax.swing.*;

public class ovning56 {
    String s = JOptionPane.showInputDialog("Skriv en text?");
    int i;
    for (i=0 ; i<s.length() ; i=i+1)
        if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
            break;
        if (i < s.length())
            JOptionPane.showMessageDialog("");
    }
}
