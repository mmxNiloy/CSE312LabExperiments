package Forms;

import Frames.OutputFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class OutputForm {
    private JPanel mainPanel;
    private MarkSheetOutputForm markSheet;
    private JLabel lblStudentName;
    private JLabel lblStudentID;
    private JLabel lblDepartment;
    private JLabel lblGrade;
    private JLabel lblCGPA;
    private JLabel lblTotalEarnedCredits;
    private JButton closeButton;
    private JButton printButton;

    public OutputForm(JFrame parentFrame) {
        closeButton.addActionListener(e -> {
            parentFrame.dispose();
        });
    }

    public OutputForm() {

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setStudentName(String name) { lblStudentName.setText(name); }
    public void setStudentID(int studentID) { lblStudentID.setText(String.valueOf(studentID)); }
    public void setDepartment(String department) { lblDepartment.setText(department); }
    public void setCGPA(float cgpa) { lblCGPA.setText(String.valueOf(cgpa)); }
    public void setGrade(String grade) { lblGrade.setText(grade); }

    public void setMarkSheetInformation(String[] grades, float[] gpaList, int[] credits) {
        int credit = gpaList[0] != 0.0f ? credits[0] : 0;
        int totalCredits = credit;

        markSheet.setGradeA(grades[0]);
        markSheet.setGPA_A(gpaList[0]);
        markSheet.setCreditA(credit);

        credit = gpaList[1] != 0.0f ? credits[1] : 0;
        totalCredits += credit;
        markSheet.setGradeB(grades[1]);
        markSheet.setGPA_B(gpaList[1]);
        markSheet.setCreditB(gpaList[1] != 0.0f ? credits[1] : 0);

        credit = gpaList[2] != 0.0f ? credits[2] : 0;
        totalCredits += credit;
        markSheet.setGradeC(grades[2]);
        markSheet.setGPA_C(gpaList[2]);
        markSheet.setCreditC(gpaList[2] != 0.0f ? credits[2] : 0);

        lblTotalEarnedCredits.setText(String.valueOf(totalCredits));
    }
}
