package forms;

import model.ExamVerdict;
import model.MarkSheet;
import model.ExamController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ResultsForm {
    private JTabbedPane tabView;
    private JPanel mainPanel;
    private JPanel tabStudents;
    private JPanel tabTeachers;
    private JPanel tabOfficers;
    private JPanel tabStaff;
    private JTable tableStu;
    private JTable tableTch;
    private JTable tableOff;
    private JTable tableStf;

    private DefaultTableModel dtmStu;
    private DefaultTableModel dtmTch;
    private DefaultTableModel dtmOff;
    private DefaultTableModel dtmStf;

    public ResultsForm() {
        var results = ExamController.RESULTS;
        for(String dept : results.keySet()) {
            for(MarkSheet ms : results.get(dept)) {
                System.out.println(ms.getName() + ' ' + dept + ' ' + ms.getTypeId());

                boolean isValid = ms.getVerdict() != ExamVerdict.INVALID;

                switch (ms.getTypeId()) {
                    case STUDENT -> {
                        dtmStu.addRow(new String[]{
                            ms.getName(),
                            dept,
                            isValid ? ms.getAdmission() + "" : "0",
                            ms.getVerdict().name()
                        });
                    }
                    case TEACHER -> {
                        dtmTch.addRow(new String[]{
                            ms.getName(),
                            dept,
                            isValid ? ms.getViva() + "" : "0",
                            ms.getVerdict().name()
                        });
                    }
                    case OFFICER -> {
                        dtmOff.addRow(new String[] {
                            ms.getName(),
                            dept,
                            isValid ? ms.getWritten() + "" : "0",
                            isValid ? ms.getViva() + "" : "0",
                            ms.getVerdict().name()
                        });
                    }
                    case STAFF -> {
                        dtmStf.addRow(new String[] {
                            ms.getName(),
                            dept,
                            isValid ? ms.getWritten() + "" : "0",
                            isValid ? ms.getViva() + "" : "0",
                            isValid ? ms.getPractical() + "" : "0",
                            ms.getVerdict().name()
                        });
                    }
                    default -> {
                    }
                }
            }
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        String[] tabStuHeaders = {"Name", "Department", "Score", "Result"};

        dtmStu = new DefaultTableModel(null, tabStuHeaders);
        tableStu = new JTable(dtmStu);

        dtmTch = new DefaultTableModel(null, tabStuHeaders);
        tableTch = new JTable(dtmTch);

        String[] tabOffHeaders = {"Name", "Department", "Written score", "Viva score", "Result"};
        dtmOff = new DefaultTableModel(null, tabOffHeaders);
        tableOff = new JTable(dtmOff);

        String[] tabStfHeaders = {"Name", "Department", "Written score", "Viva score", "Practical", "Result"};
        dtmStf = new DefaultTableModel(null, tabStfHeaders);
        tableStf = new JTable(dtmStf);
    }
}
