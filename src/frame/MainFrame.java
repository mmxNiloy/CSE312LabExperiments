package frame;

import form.MainForm;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Experiment 13");
        setSize(720, 480);
        setVisible(true);

        add(new MainForm(this).getMainPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
