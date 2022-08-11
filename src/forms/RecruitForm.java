package forms;

import model.Registrar;

import javax.swing.*;

public class RecruitForm {
    private JPanel mainPanel;
    private JButton conductExamButton;
    private JButton cancelButton;
    private RecruitCandidateInfo infoForm;
    private int option;

    public RecruitForm(JFrame parentFrame) {
        cancelButton.addActionListener(e -> {
            parentFrame.dispose();
        });

        conductExamButton.addActionListener(e -> {
            switch (option) {
                case 0 -> new Registrar.Teacher().startExam(infoForm);
                case 1 -> new Registrar.Officer().startExam(infoForm);
                case 2 -> new Registrar.Staff().startExam(infoForm);
                default -> {
                }
            }

            infoForm.reset();
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
    public void setOption(int option) {
        this.option = option;
    }
}
