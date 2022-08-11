package Frames;

import Forms.MainForm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Student CGPA Calculator");
        setSize(720, 512);
        setVisible(true);

//        JLabel label = new JLabel("CGPA Calculator");
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//        add(label, BorderLayout.NORTH);

        add(new MainForm(this).getMainPanel());
    }
}
