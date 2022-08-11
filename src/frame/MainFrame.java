package frame;

import form.MainForm;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Word counter");
        setSize(720, 480);
        setVisible(true);

        add(new MainForm(this).getMainPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
