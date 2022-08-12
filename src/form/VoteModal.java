package form;

import javax.swing.*;
import java.awt.event.*;

public class VoteModal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel lblName;
    private JTextField tfAgreed;
    private JLabel lblTotal;
    private String storage;

    public VoteModal(String name, int totalMemCnt) {
        setContentPane(contentPane);
        setModal(true);
        setLocation(64, 64);
        getRootPane().setDefaultButton(buttonOK);

        lblName.setText(name);
        lblTotal.setText(" / " + totalMemCnt);

        buttonOK.addActionListener(e -> onOK());

        buttonCancel.addActionListener(e -> onCancel());

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
        storage = tfAgreed.getText().trim();
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getCount() {
        return tfAgreed.getText().trim();
    }
}
