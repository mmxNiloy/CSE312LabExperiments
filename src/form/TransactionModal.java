package form;

import javax.swing.*;
import java.awt.event.*;

public class TransactionModal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tfAmount;
    private JLabel lblAmount;
    private int provided;

    public TransactionModal(int fees) {
        lblAmount.setText(" / " + fees);
        provided = 0;

        setTitle("Transaction Module");
        setContentPane(contentPane);
        setSize(480, 480);
        setLocation(64, 64);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

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
        contentPane.registerKeyboardAction(e -> onCancel(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        try {
            provided = Integer.parseInt(tfAmount.getText().trim());
        } catch(Exception e) {
            provided = 0;
        }


        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        provided = -1;
        dispose();
    }

    public int getProvided() {
        return provided;
    }
}
