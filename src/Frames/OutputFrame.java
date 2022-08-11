package Frames;

import Forms.OutputForm;
import Forms.StudentInformationOutputForm;
import Models.Grader;

import javax.swing.*;

public class OutputFrame extends JFrame {
    private final OutputForm oForm;

    public OutputFrame() {
        super("Result");

        setLocation(64, 64);
        setSize(720, 512);
        setVisible(false);

        oForm = new OutputForm(this);
        add(oForm.getMainPanel());
    }

    public void bindData(Grader grader) {
        oForm.setStudentName(grader.getName());
        oForm.setCGPA(grader.getCGPA());
        oForm.setDepartment(grader.getDeptName());
        oForm.setStudentID(grader.getId());
        oForm.setGrade(grader.getGrade());

        oForm.setMarkSheetInformation(grader.getGrades(), grader.getGpaGrades(), grader.getCourseCredits());
    }
    public void setVisibility(boolean isVisible) { setVisible(isVisible); }
}
