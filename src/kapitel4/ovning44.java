package kapitel4;

import javax.swing.*;

/*
Kollar om brevet är för stort eller litet och skriver tillbaka ok eller inte ok.
Filip Andersson 2020-10-13
*/

public class ovning44 {
    public static void main (String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length of paper in millimeters"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Width"));
        int thickness = Integer.parseInt(JOptionPane.showInputDialog("Thickness"));
        int totalMeasurements = length+width+thickness;

        if (((length>140 && width>90) && (length<600 && thickness<100)) && totalMeasurements<900){
                JOptionPane.showMessageDialog(null, "it's ok");
        }
        else{
            JOptionPane.showMessageDialog(null, "won't work");
        }
            
    }

}
