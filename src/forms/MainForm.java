package forms;

import frame.RecruitFrame;
import frame.ResultsFrame;
import frame.StudentEnrollmentFrame;
import model.ExamController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton recruitButton;
    private JButton exitButton;
    private JButton enrollButton;
    private JPanel mainPanel;
    private JButton publishResultButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public MainForm(JFrame parentFrame) {
        exitButton.addActionListener(e -> {
            parentFrame.dispose();
        });
        recruitButton.addActionListener(e -> {
            RecruitFrame rf = new RecruitFrame();

            String[] options = {"Teacher", "Officer", "Staff", "Cancel"};
            int op = JOptionPane.showOptionDialog(
                parentFrame, "Who do you want to recruit?",
            "Recruit", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                options, options[3]
            );

            rf.setOption(op);
            rf.setVisible(op >= 0 && op != options.length - 1);
        });

        enrollButton.addActionListener(e -> {
            new StudentEnrollmentFrame();
        });

        publishResultButton.addActionListener(e -> {
            ExamController.processResults();
            new ResultsFrame();
        });
    }
}
