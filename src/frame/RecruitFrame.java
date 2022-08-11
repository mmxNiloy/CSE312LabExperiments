package frame;

import forms.RecruitForm;

import javax.swing.*;

public class RecruitFrame extends JFrame {
    private RecruitForm rf;

    public RecruitFrame() {
        super("Recruit");
        setLocation(64, 64);
        setSize(720, 480);
        setVisible(false);
        rf = new RecruitForm(this);
        add(rf.getMainPanel());
    }

    public void setOption(int option) {
        rf.setOption(option);
    }
}
