package Forms;

import javax.swing.*;

public class MarkSheetOutputForm {
    private JLabel lblGradeA;
    private JLabel lblGPA_A;
    private JLabel lblCreditA;
    private JLabel lblCreditB;
    private JLabel lblGPA_B;
    private JLabel lblGradeB;
    private JLabel lblCreditC;
    private JLabel lblGPA_C;
    private JLabel lblGradeC;
    private JPanel mainPanel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setGradeA(String grade) { lblGradeA.setText(grade); }
    public void setGradeB(String grade) { lblGradeB.setText(grade); }
    public void setGradeC(String grade) { lblGradeC.setText(grade); }

    public void setGPA_A(float grade) { lblGPA_A.setText(String.valueOf(grade)); }
    public void setGPA_B(float grade) { lblGPA_B.setText(String.valueOf(grade)); }
    public void setGPA_C(float grade) { lblGPA_C.setText(String.valueOf(grade)); }

    public void setCreditA(int grade) { lblCreditA.setText(String.valueOf(grade)); }
    public void setCreditB(int grade) { lblCreditB.setText(String.valueOf(grade)); }
    public void setCreditC(int grade) { lblCreditC.setText(String.valueOf(grade)); }
}
