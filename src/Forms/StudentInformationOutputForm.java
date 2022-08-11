package Forms;

import javax.swing.*;

public class StudentInformationOutputForm {
    private JLabel lblName;
    private JLabel lblStudentID;
    private JLabel lblDepartment;
    private JLabel lblCGPA;
    private JLabel lblGrade;
    private JPanel mainPanel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setStudentName(String name) { lblName.setText(name); }
    public void setStudentID(int studentID) { lblStudentID.setText(String.valueOf(studentID)); }
    public void setDepartment(String department) { lblDepartment.setText(department); }
    public void setCGPA(float cgpa) { lblCGPA.setText(String.valueOf(cgpa)); }
    public void setGrade(String grade) { lblGrade.setText(grade); }


}
