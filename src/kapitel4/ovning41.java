import javax.swing.*;

/*
Tar genomsnitt minuter per månad och kostnaden per minut från textruta, konverterar till int och räknar totalkostnad. Tar även hänsyn för 10% rea vid priser över 1000kr.
Filip Andersson 2020-09-29
*/

public class ovning41 {
    public static void main (String[] args) {
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Average time in minutes per month?"));
        float cost = Float.parseFloat(JOptionPane.showInputDialog("Cost in dollars per minute?"));
        float totalprice = minutes*cost;
        if (totalprice>=1000) {
            totalprice*=0.9f;
        }

        JOptionPane.showMessageDialog(null, "Total cost=$" + totalprice, "Information", JOptionPane.INFORMATION_MESSAGE);

    }
}