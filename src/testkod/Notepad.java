package testkod;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Notepad {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        menu1.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Save");
        menu1.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Load");
        menu1.add(menuItem3);
        menuBar.add(menu1);
        frame.setJMenuBar(menuBar);
        Notepad notepad = new Notepad();
        frame.setContentPane(notepad.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextArea textArea1;
}
