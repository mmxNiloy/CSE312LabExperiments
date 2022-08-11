package frame;

import form.MainForm;

import javax.swing.*;
import java.io.IOException;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("I/O Example");
        setSize(720, 480);
        setVisible(true);

        add(new MainForm(this).getMainPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
