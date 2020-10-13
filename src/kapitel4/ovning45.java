package kapitel4;

import javax.swing.*;

/*
Kollar om brevet är för stort eller litet och skriver tillbaka ok eller inte ok.
Filip Andersson 2020-10-13
*/

public class ovning45 {
    public static void main (String[] args) {
        int callLength = Integer.parseInt(JOptionPane.showInputDialog("How long was the call?"));
        int daytime = JOptionPane.showConfirmDialog(null, "Is it daytime and a workday?");
        if (daytime == 0){

            JOptionPane.showMessageDialog(null, "it's ok");
        }
        else if(daytime == 1){

        }
            
    }

}
