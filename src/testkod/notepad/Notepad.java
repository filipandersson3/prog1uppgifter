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
    private String filename = "";

    public Notepad() {
        menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        menu1.add(menuItem1);
        JMenuItem menuItem = new JMenuItem("Save");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu1.add(menuItem);
        JMenuItem menuItem2 = new JMenuItem("Save as...");
        menu1.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Open...");
        menu1.add(menuItem3);
        menu1.addSeparator();
        JMenuItem menuItem4 = new JMenuItem("Exit");
        menu1.add(menuItem4);
        menuBar.add(menu1);
        menuItem1.addActionListener(new NewAL());
        menuItem.addActionListener(new SaveAL());
        menuItem2.addActionListener(new SaveAsAL());
        menuItem3.addActionListener(new OpenAL());
        menuItem4.addActionListener(new ExitAL());
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

    private class NewAL implements ActionListener { //New file
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                filename = "";
            }
    }
    private class SaveAL implements ActionListener { //Save file
        @Override
        public void actionPerformed(ActionEvent e) {
            save();
        }
    }
    private void save() {
        if (filename.equals("")) {
            saveAs();
        } else {
            FileWriter fw = null;
            try {
                fw = new FileWriter(filename);
            } catch (IOException f) {
                f.printStackTrace();
            }
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter outFile = new PrintWriter(bw);
            outFile.print(textArea1.getText());
            outFile.flush();
            outFile.close();
        }
    }

    private class SaveAsAL implements ActionListener { //Save As file
        @Override
        public void actionPerformed(ActionEvent e) {
            saveAs();
        }
    }

    private void saveAs() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result!=JFileChooser.APPROVE_OPTION){
            JOptionPane.showConfirmDialog(null,
                    "No file was chosen", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            return;
        }
        filename = fc.getSelectedFile().getAbsolutePath();
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
        } catch (IOException f) {
            f.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        outFile.print(textArea1.getText());
        outFile.flush();
        outFile.close();
    }

    private class OpenAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            open();
        }
    }

    private void open() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result!=JFileChooser.APPROVE_OPTION){
            JOptionPane.showConfirmDialog(null,
                    "No file was chosen", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            return;
        }
        filename = fc.getSelectedFile().getAbsolutePath();
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

    private class ExitAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
