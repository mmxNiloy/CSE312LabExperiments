package form;

import model.MyThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextArea taInput;
    private JButton countButton;
    private JButton exitButton;
    private JLabel lblA;
    private JLabel lblAn;
    private JLabel lblThe;
    private JButton resetButton;

    public MainForm(JFrame parent) {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.dispose();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taInput.setText("");
                lblA.setText("");
                lblAn.setText("");
                lblThe.setText("");
            }
        });
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    onCount();
                } catch(InterruptedException ignored) {}
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void onCount() throws InterruptedException {
        MyThread a = new MyThread();
        MyThread an = new MyThread();
        MyThread the = new MyThread();

        a.setMatch("a");
        a.setText(taInput.getText().trim());

        an.setMatch("an");
        an.setText(taInput.getText().trim());

        the.setMatch("the");
        the.setText(taInput.getText().trim());

        a.start();
        an.start();
        the.start();

        a.join();
        lblA.setText(a.getCount() + "");

        an.join();
        lblAn.setText(an.getCount() + "");

        the.join();
        lblThe.setText(the.getCount() + "");
    }
}
