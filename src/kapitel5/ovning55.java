package kapitel5;

import javax.swing.*;

/*
Räknar summan av 1+2+3+4...+n med en for-loop
Filip Andersson 2020-10-20
*/

public class ovning55 {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        int summa = 0;
        for (int k = 1 ; k <= n ; k++) {
            summa = summa + k;
        }
        JOptionPane.showMessageDialog(null, "Summan blir " + summa);


    }

}