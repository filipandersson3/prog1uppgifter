package kapitel5;

import javax.swing.*;

/*
Loop som räknar från 1^2 till n^2 och summerar alla nummer.
Filip Andersson 2020-10-16
*/

public class ovning51 {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        int summa = 0;
        int k = 1;
        while (k <= n*n) {
            summa = summa + k*k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "Summan blir " + summa);


    }

}