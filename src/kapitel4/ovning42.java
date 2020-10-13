package kapitel4;

import javax.swing.*;

/*
Beräknar om årskort på gym är värt det eller inte.
Filip Andersson 2020-09-29
*/

public class ovning42 {
    public static void main (String[] args) {
        int yearlycost = Integer.parseInt(JOptionPane.showInputDialog("Cost for one year?"));
        int onetimecost = Integer.parseInt(JOptionPane.showInputDialog("Cost for one day?"));
        int times = Integer.parseInt(JOptionPane.showInputDialog("How many times do you plan on going to the gym?"));
        int onetimetotalcost = onetimecost*times;
        if (onetimetotalcost>yearlycost) {
            JOptionPane.showMessageDialog(null, "Buy the yearly plan");
        } else {
            JOptionPane.showMessageDialog(null, "Don't buy the yearly plan");
        }

    }
}