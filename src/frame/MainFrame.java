package frame;

import form.MainForm;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Article Counter");
        setSize(720, 480);
        setLocation(64, 64);

        // Components
        add(new MainForm(this).getMainPanel());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
