package frame;

import forms.ExamForm;

import javax.swing.*;

public class ExamFrame extends JFrame {
    public ExamForm form;

    public ExamFrame() {
        super("Conducting Exam");
        setLocation(128, 128);
        setSize(720, 480);
        form = new ExamForm(this);
        add(form.getMainPanel());
        setVisible(false);
    }

    public void setVisibility(boolean isVisible) {
        setVisible(isVisible);
    }
}
