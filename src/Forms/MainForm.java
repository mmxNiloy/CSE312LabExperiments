package Forms;

import Frames.MainFrame;
import Frames.OutputFrame;
import Models.Grader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainForm {
    private BasicInformationForm basicInfoForm;
    private CourseInformation courseInfoForm;
    private JPanel mainPanel;
    private JPanel buttonGroup;
    private JButton resetButton;
    private JButton calculateButton;
    private JButton exitButton;

    public MainForm(JFrame parentFrame) {
        exitButton.addActionListener(e -> {
            parentFrame.dispose();
            parentFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
        resetButton.addActionListener(e -> {
            basicInfoForm.clearForm();
            courseInfoForm.clearForm();
        });

        calculateButton.addActionListener(e -> {
            // Bind relavent data
            Grader grader = new Grader();
            grader.setName(basicInfoForm.getStudentName());
            grader.setId(basicInfoForm.getStudentID());
            grader.setDeptName(basicInfoForm.getDepartment());

            grader.setCourseCredits(courseInfoForm.getCredits());
            grader.setMarks(courseInfoForm.getMarks());
            grader.setCtmaMarks(courseInfoForm.getCTMarks());

            // Calculate cgpa
            grader.computeLetterGrades();
            grader.computeCGPA();

            OutputFrame output = new OutputFrame();
            output.bindData(grader);
            output.setVisibility(true);
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
