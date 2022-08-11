package frame;

import forms.StudentEnrollmentForm;

import javax.swing.*;

public class StudentEnrollmentFrame extends JFrame {
    public StudentEnrollmentFrame() {
        super("Enroll a student");
        setLocation(64, 64);
        setSize(720, 480);
        add(new StudentEnrollmentForm(this).getMainPanel());
        setVisible(true);
    }
}
