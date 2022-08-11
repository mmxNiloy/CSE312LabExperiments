package forms;

import javax.swing.*;

public class RecruitCandidateInfo {
    private JTextField tfName;
    private JTextField tfDepartment;
    private JTextField tfContact;
    private JPanel mainPanel;

    public String getName() {
        return tfName.getText();
    }

    public String getDepartment() {
        return tfDepartment.getText();
    }

    public String getContact() {
        return tfContact.getText();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void reset() {
        tfName.setText("");
        tfContact.setText("");
        tfDepartment.setText("");
    }
}
