package testkod.komplexatal;

import javax.swing.*;
import java.awt.*;

public class KomplexTest {

    public static void main(String[] args) {
        double reelinput = 0;
        try {
            reelinput = Double.parseDouble(JOptionPane.showInputDialog(null, "vad är det reela talet?"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        double imaginarinput = 0;
        try {
            imaginarinput = Double.parseDouble(JOptionPane.showInputDialog(null, "vad är det imaginära talet?"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Komplex a = new Komplex(reelinput,imaginarinput);
        Komplex b = new Komplex(4.0,1.0);

        System.out.println("talet borde vara "+ a.toString() + "\n" + a);

        Komplex c = a.add(b);
        Komplex d = new Komplex(7.0,3.0);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        c = a.multiply(b);
        d = new Komplex(10,11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till " + a.toString() + " är " + a.arg());
        if (a.arg() == Math.atan(2.0/3)) {
            System.out.println("arg() funkar!!");
        }
    }
}