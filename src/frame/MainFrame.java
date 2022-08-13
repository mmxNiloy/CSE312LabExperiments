package frame;

import form.MainForm;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Exam Form Control");
        setSize(720, 480);
        setVisible(true);

        // Components
        add(new MainForm(this).getMainPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
