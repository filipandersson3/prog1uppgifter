package diagnosloopar;
import javax.swing.*;

public class gangertabellwhileloop {
    public static void main (String[] args) {
        int multiplikationstal = Integer.parseInt(JOptionPane.showInputDialog("Vilken multiplikationstabell vill du ha? (svara i heltal)"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Hur långt vill du att den ska multiplicera?"));
        int i = 0;
        while (i <= max){
            System.out.println(multiplikationstal*i);
            i++;
        }
    }
}
