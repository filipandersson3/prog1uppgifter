package testkod.notepadMVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class NotepadController {
    private NotepadModel model;
    private NotepadView view;

    public NotepadController() {
        view = new NotepadView();
        model = new NotepadModel(view.getTextArea1(),view.getFilename());
        JFrame frame = new JFrame("Notepad");
        frame.setContentPane(view.getPanel1());
        frame.setJMenuBar(view.getMenuBar());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        view.getMenuItem1().addActionListener(new NewAL());
        view.getMenuItem().addActionListener(new SaveAL());
        view.getMenuItem2().addActionListener(new SaveAsAL());
        view.getMenuItem3().addActionListener(new OpenAL());
        view.getMenuItem4().addActionListener(new ExitAL());
    }

    public static void main(String[] args) {
        NotepadController controller = new NotepadController();
    }

    private class NewAL implements ActionListener { //New file
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTextArea1().setText("");
                view.setFilename("");
            }
    }
    private class SaveAL implements ActionListener { //Save file
        @Override
        public void actionPerformed(ActionEvent e) {
            model.save();
        }
    }

    private class SaveAsAL implements ActionListener { //Save As file
        @Override
        public void actionPerformed(ActionEvent e) {
            model.saveAs();
        }
    }

    private class OpenAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.open();
        }
    }

    private class ExitAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
