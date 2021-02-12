package testkod.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Notepad {

    public Notepad() {
        menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        menu1.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Save");
        menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menu1.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Load");
        menu1.add(menuItem3);
        menuBar.add(menu1);
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("new");
            }
        });
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("save");
            }
        });
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("load");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        Notepad notepad = new Notepad();
        frame.setContentPane(notepad.panel1);
        frame.setJMenuBar(notepad.menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextArea textArea1;
    private JMenuBar menuBar;
}
