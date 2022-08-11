package Forms;

import javax.swing.*;

public class BasicInformationForm {
    private JTextField tfStudentName;
    private JTextField tfStudentID;
    private JTextField tfDepartment;
    private JPanel mainPanel;

    public void clearForm() {
        tfStudentName.setText("");
        tfStudentID.setText("");
        tfDepartment.setText("");
    }

    public String getStudentName() {
        return tfStudentName.getText().trim();
    }

    public int getStudentID() {
        return Integer.parseInt(tfStudentID.getText().trim());
    }

    public String getDepartment() {
        return tfDepartment.getText().trim();
    }
}
