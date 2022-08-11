package Forms;

import javax.swing.*;

public class CourseInformation {
    private JPanel mainPanel;
    private JTextField tfMarkA;
    private JTextField tfCreditA;
    private JTextField tfCreditB;
    private JTextField tfMarkB;
    private JTextField tfCreditC;
    private JTextField tfMarkC;
    private JTextField tfCTMarkA;
    private JTextField tfCTMarkB;
    private JTextField tfCTMarkC;

    public void clearForm() {
        tfMarkA.setText("");
        tfMarkB.setText("");
        tfMarkC.setText("");
        tfCTMarkA.setText("");
        tfCTMarkB.setText("");
        tfCTMarkC.setText("");
        tfCreditA.setText("");
        tfCreditB.setText("");
        tfCreditC.setText("");
    }

    public float[] getMarks() {
        float a = Float.parseFloat(tfMarkA.getText().trim());
        float b = Float.parseFloat(tfMarkB.getText().trim());
        float c = Float.parseFloat(tfMarkC.getText().trim());

        return new float[]{a, b, c};
    }

    public float[] getCTMarks() {
        float a = Float.parseFloat(tfCTMarkA.getText().trim());
        float b = Float.parseFloat(tfCTMarkB.getText().trim());
        float c = Float.parseFloat(tfCTMarkC.getText().trim());

        return new float[]{a, b, c};
    }

    public int[] getCredits() {
        int a = Integer.parseInt(tfCreditA.getText().trim());
        int b = Integer.parseInt(tfCreditB.getText().trim());
        int c = Integer.parseInt(tfCreditC.getText().trim());

        return new int[]{a, b, c};
    }
}
