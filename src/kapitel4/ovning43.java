package kapitel4;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/*
Kollar vilket betyg visst många poäng motsvarar.
Filip Andersson 2020-10-06
*/

public class ovning43 {
    public static void main (String[] args) {
        int points = Integer.parseInt(JOptionPane.showInputDialog("How many points?"));
        if (points<25) {
            JOptionPane.showMessageDialog(null, "Du fick F");
            
        } else if (points<30){
            JOptionPane.showMessageDialog(null, "Du fick E");

        } else if (points<35){
            JOptionPane.showMessageDialog(null, "Du fick D");
            
        } else if (points<40){
            JOptionPane.showMessageDialog(null, "Du fick C");
            
        } else if (points<45){
            JOptionPane.showMessageDialog(null, "Du fick B");
        } else {
            JOptionPane.showMessageDialog(null, "Du fick A :)");
        }

    }

}