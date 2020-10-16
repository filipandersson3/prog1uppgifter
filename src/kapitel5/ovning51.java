package kapitel5;

import javax.swing.*;

/*

Filip Andersson 2020-10-16
*/

public class ovning51 {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        int summa = 0;
        int k = 1;
        while (k <= n) {
            summa = summa + k;
            k = k + 1;
        }


    }

}