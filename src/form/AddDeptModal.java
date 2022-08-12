package form;

import model.Academy;

import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class AddDeptModal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tfDept;
    private JComboBox<String> cbFaculty;
    private String[] storage;

    public AddDeptModal() {
        setContentPane(contentPane);
        setModal(true);
        setLocation(64, 64);
        setTitle("Propose a new Department");
        getRootPane().setDefaultButton(buttonOK);

        cbFaculty.setModel(new DefaultComboBoxModel<>(Academy.FAC_NAMES));

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
        if(storage == null) storage = new String[2];
        storage[0] = tfDept.getText().trim();
        storage[1] = Objects.requireNonNull(cbFaculty.getSelectedItem()).toString().trim();
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setStorage(String[] storage) {
        this.storage = storage;
    }
}
