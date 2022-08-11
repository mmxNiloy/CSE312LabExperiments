package form;

import model.MyThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextArea taInput;
    private JButton calculateButton;
    private JButton exitButton;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;

    public MainForm(JFrame parent) {
        exitButton.addActionListener(e -> {
            parent.dispose();
        });

        calculateButton.addActionListener(e -> {
            String message = taInput.getText().trim();

            if(message.isEmpty()) return;

            MyThread thA = new MyThread(message);
            MyThread thB = new MyThread(message);
            MyThread thC = new MyThread(message);

            thA.start();
            thB.start();
            thC.start();

            try {
                thA.join();
                lblA.setText(thA.getCount() + "");
            } catch (InterruptedException ex) {
                lblA.setText("Error: Thread Interrupted!");
            }
            try {
                thB.join();
                lblB.setText(thB.getCount() + "");
            } catch (InterruptedException ex) {
                lblB.setText("Error: Thread Interrupted!");
            }
            try {
                thC.join();
                lblC.setText(thC.getCount() + "");
            } catch (InterruptedException ex) {
                lblC.setText("Error: Thread Interrupted!");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
