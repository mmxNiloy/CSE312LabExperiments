package forms;

import forms.RecruitCandidateInfo;
import model.Registrar;

import javax.swing.*;

public class StudentEnrollmentForm {
    private JPanel mainPanel;
    private JButton conductExamButton;
    private JButton cancelButton;
    private RecruitCandidateInfo infoForm;

    public StudentEnrollmentForm(JFrame parentFrame) {
        cancelButton.addActionListener(e -> {
            parentFrame.dispose();
        });

        conductExamButton.addActionListener(e -> {
            new Registrar.Student().startExam(infoForm);
            infoForm.reset();
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
