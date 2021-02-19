package testkod.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class Notepad {
    private JPanel panel1;
    private JTextArea textArea1;
    private JScrollPane scrollPane1;
    private JMenuBar menuBar;

    public Notepad() {
        menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        menu1.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Save");
        menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu1.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Open...");
        menu1.add(menuItem3);
        menuBar.add(menu1);
        menuItem1.addActionListener(new ActionListener() {  //New file
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
        menuItem2.addActionListener(new ActionListener() {  //Save file
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        menuItem3.addActionListener(new ActionListener() {  //Open file
            @Override
            public void actionPerformed(ActionEvent e) {
                readFile();
            }
        });
    }

    private void saveFile() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result!=JFileChooser.APPROVE_OPTION){
            System.out.println("ingen fil valdes");
            System.exit(0);
        }
        String filename = fc.getSelectedFile().getAbsolutePath();
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        outFile.print(textArea1.getText());
        outFile.flush();
        outFile.close();
    }

    private void readFile() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result!=JFileChooser.APPROVE_OPTION){
            System.out.println("ingen fil valdes");
            System.exit(0);
        }
        String filename = fc.getSelectedFile().getAbsolutePath();
        FileReader fr = null;
        textArea1.setText("");
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException g) {
            g.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        String line;
        try {
            while ((line = inFile.readLine() ) != null) {
                textArea1.append(line+"\n");
            }
            inFile.close();
        } catch (IOException f) {
            f.printStackTrace();
        }
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
}
