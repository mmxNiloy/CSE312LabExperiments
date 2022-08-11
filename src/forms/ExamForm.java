package forms;

import model.CandidateType;
import model.ExamVerdict;
import model.MarkSheet;
import model.ExamController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ExamForm {
    private CandidateType typeId;
    private JLabel lblName;
    private JLabel lblDepartment;
    private JTextField tfViva;
    private JTextField tfWritten;
    private JTextField tfPractical;
    private JTextField tfAdmission;
    private JPanel mainPanel;
    private JPanel panViva;
    private JPanel panWritten;
    private JPanel panPractical;
    private JPanel panAdmission;
    private JButton submitButton;
    private JButton cancelButton;
    private JCheckBox hasPaidCheckBox;

    public ExamForm(JFrame parentFrame) {
        submitButton.addActionListener(e -> {
            String name = lblName.getText();
            String department = lblDepartment.getText();
            float viva = 0.0f;
            float written = 0.0f;
            float practical = 0.0f;
            float admission = 0.0f;

            try {
                viva = Float.parseFloat(tfViva.getText().trim());
            } catch(Exception ignored) {}

            try {
                written = Float.parseFloat(tfWritten.getText().trim());
            } catch(Exception ignored) {}

            try {
                practical = Float.parseFloat(tfPractical.getText().trim());
            } catch(Exception ignored) {}

            try {
                admission = Float.parseFloat(tfAdmission.getText().trim());
            } catch(Exception ignored) {}

            MarkSheet ms = new MarkSheet(typeId, name, viva, written, practical, admission, ExamVerdict.UNPROCESSED, hasPaidCheckBox.isSelected());

            List<MarkSheet> res = ExamController.RESULTS.get(department);
            if(res == null) res = new ArrayList<>();

            res.add(ms);
            ExamController.RESULTS.put(department, res);
            parentFrame.dispose();
        });

        cancelButton.addActionListener(e -> {
            parentFrame.dispose();
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setVivaVisible(boolean flag) { panViva.setVisible(flag); }
    public void setWrittenVisible(boolean flag) { panWritten.setVisible(flag); }
    public void setPracticalVisible(boolean flag) { panPractical.setVisible(flag); }
    public void setAdmissionVisible(boolean flag) { panAdmission.setVisible(flag); }

    public void resetPanels() {
        panViva.setVisible(false);
        panWritten.setVisible(false);
        panPractical.setVisible(false);
        panAdmission.setVisible(false);
    }

    public void setName(String name) {
        lblName.setText(name);
    }

    public void setDepartment(String department) {
        lblDepartment.setText(department);
    }

    public void setTypeId(CandidateType typeId) {
        this.typeId = typeId;
    }
}
