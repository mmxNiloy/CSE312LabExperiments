package frame;

import form.AdmitCardForm;
import model.AdmitCard;

import javax.swing.*;

public class AdmitCardFrame extends JFrame {
    private AdmitCardForm acForm;

    public AdmitCardFrame() {
        super("Admit card");
        setSize(720, 480);
        setLocation(128, 128);
        setVisible(false);

        acForm = new AdmitCardForm(this);
        add(acForm.getMainPanel());
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void setAdmitCard(AdmitCard admitCard) {
        acForm.setAdmitCard(admitCard);
        acForm.bindData();
    }
}
