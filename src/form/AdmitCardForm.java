package form;

import model.AdmitCard;

import javax.swing.*;
import java.awt.*;

public class AdmitCardForm {
    private JPanel mainPanel;
    private JButton printButton;
    private JButton closeButton;
    private JLabel lblName;
    private JLabel lblID;
    private JLabel lblSem;
    private JLabel lblKey;
    private AdmitCard admitCard;

    public AdmitCardForm(JFrame parent) {
        closeButton.addActionListener(e -> {
            parent.dispose();
        });

        printButton.addActionListener(e-> {
            System.out.println("Communicating with external output devices are out of the scope.");
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setAdmitCard(AdmitCard admitCard) {
        this.admitCard = admitCard;
    }

    public void bindData() {
        lblName.setText(admitCard.getName());
        lblID.setText(admitCard.getID() + "");
        lblSem.setText(admitCard.getSemester() + " semester");
        lblKey.setText(admitCard.getKey());
    }
}
