package form;

import model.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainForm {
    private JPanel mainPanel;
    private JTable tableEmp;
    private JButton saveButton;
    private JButton addButton;
    private JButton exitButton;
    private final Employee dm;
    private DefaultTableModel dtm;

    public MainForm(JFrame parent) {
        dm = new Employee();

        exitButton.addActionListener(e -> {
            parent.dispose();
        });

        addButton.addActionListener(e -> {
            AddEmployeeModal dialog = new AddEmployeeModal();
            dialog.setDataModel(dm);
            dialog.pack();
            dialog.setVisible(true);

            dtm.addRow(dm.toStringArray());
        });

        saveButton.addActionListener(e -> {
            FileWriter fw = null;
            try {
                fw = new FileWriter("employee.dat");
            } catch (IOException ex) {
                JOptionPane.showOptionDialog(parent,
                        "Error! Cannot open file.", "Error",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, new String[]{"OK"}, 0);
                parent.dispose();
            }

            assert fw != null;
            BufferedWriter writer = new BufferedWriter(fw);
            try {
                writer.write("Name, Designation, Basic Salary\n");
            } catch (IOException ex) {
                JOptionPane.showOptionDialog(parent,
                        "Error! Cannot open file.", "Error",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, new String[]{"OK"}, 0);
                parent.dispose();
            }



            for(int row = 0 ; row < dtm.getRowCount() ; row++) {
                for(int col = 0 ; col < dtm.getColumnCount() ; col++) {
                    try {
                        System.out.println(dtm.getValueAt(row, col).toString());
                        writer.write(dtm.getValueAt(row, col).toString()
                                + (col < dtm.getColumnCount() - 1 ? ", " : "\n"));
                    } catch (IOException ex) {
                        JOptionPane.showOptionDialog(parent,
                                "Error! Cannot write to file.", "Error",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, new String[]{"OK"}, 0);
                        parent.dispose();
                    }
                }
            }

            try {
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showOptionDialog(parent,
                        "Error! Cannot save/close file.", "Error",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, new String[]{"OK"}, 0);
                parent.dispose();
            }

            JOptionPane.showOptionDialog(parent,
                    "Successfully saved to file.", "Success",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Exit"}, 0);
            parent.dispose();
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        String[] headers = {"Name", "Designation", "Basic salary"};
        dtm = new DefaultTableModel(null, headers);
        tableEmp = new JTable(dtm);
    }
}
