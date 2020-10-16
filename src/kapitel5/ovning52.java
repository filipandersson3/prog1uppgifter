package kapitel5;

import javax.swing.*;

/*
Beräknar den harmoniska serien.
Filip Andersson 2020-10-16
*/

public class ovning52 {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        double summa = 0;
        double k = 1;
        while (k <= n) {
            summa = summa + 1/k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "Summan blir " + summa);


    }

}