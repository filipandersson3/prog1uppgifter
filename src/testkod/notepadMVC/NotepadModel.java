package testkod.notepadMVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class NotepadModel {
    private JTextArea textArea1;
    private String filename = "";

    public NotepadModel(JTextArea textArea1, String filename) {
        this.textArea1 = textArea1;
        this.filename = filename;
    }

    public void save() {
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

    public void saveAs() {
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

    public void open() {
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
}
