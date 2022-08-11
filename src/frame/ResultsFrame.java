package frame;

import forms.ResultsForm;

import javax.swing.*;

public class ResultsFrame extends JFrame {
    public ResultsFrame() {
        super("Results");
        setLocation(64,64);
        setSize(720, 480);
        add(new ResultsForm().getMainPanel());
        setVisible(true);
    }
}
