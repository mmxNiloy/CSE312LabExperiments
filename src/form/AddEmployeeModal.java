package form;

import model.Employee;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;

public class AddEmployeeModal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tfName;
    private JTextField tfDesignation;
    private JTextField tfBasicSalary;
    private Employee dm;

    public AddEmployeeModal() {
        setContentPane(contentPane);
        setModal(true);
        setLocation(64, 64);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        String name = tfName.getText().trim();
        String des = tfDesignation.getText().trim();
        float sal = 0.0f;

        try {
            sal = Float.parseFloat(tfBasicSalary.getText().trim());
        } catch (Exception ignored) {}

        if(dm == null) dm = new Employee();
        dm.setName(name);
        dm.setDesignation(des);
        dm.setBasicSalary(sal);

        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setDataModel(Employee dm) {
        this.dm = dm;
    }
}
