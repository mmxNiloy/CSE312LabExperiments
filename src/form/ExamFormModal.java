package form;

import model.Course;
import model.FormModel;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExamFormModal extends JDialog {
    private JPanel contentPane;
    private JButton btnReset;
    private JButton buttonCancel;
    private JButton btnDone;
    private JTextField tfName;
    private JTextField tfCourseA;
    private JTextField tfAttendanceA;
    private JTextField tfCourseB;
    private JTextField tfAttendanceB;
    private JTextField tfCourseC;
    private JTextField tfAttendanceC;
    private JTextField tfID;
    private JComboBox<String> cbSem;
    private JCheckBox chkPassed;
    private JTextField tfDues;
    private final FormModel modelRef;

    public ExamFormModal(FormModel fm) {
        modelRef = fm;

        setTitle("Exam Form");
        setContentPane(contentPane);
        setSize(480, 480);
        setLocation(64, 64);
        setModal(true);
        getRootPane().setDefaultButton(btnReset);

        btnReset.addActionListener(e -> reset());

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

        btnDone.addActionListener(e -> {
            bindData();
            reset();
            dispose();
        });
    }

    private void reset() {
        tfName.setText("");
        tfID.setText("");
        cbSem.setSelectedIndex(0);

        tfCourseA.setText("");
        tfCourseB.setText("");
        tfCourseC.setText("");
        tfAttendanceA.setText("");
        tfAttendanceB.setText("");
        tfAttendanceC.setText("");
    }

    private void onCancel() {
        reset();
        dispose();
    }

    private void bindData() {
        String name = tfName.getText().trim();
        int id = -1;
        String semester = Objects.requireNonNull(cbSem.getSelectedItem()).toString();
        String crsA = tfCourseA.getText().trim();
        String crsB = tfCourseB.getText().trim();
        String crsC = tfCourseC.getText().trim();
        float attA = -1.0f;
        float attB = -1.0f;
        float attC = -1.0f;
        float dues = 0.0f;

        try {
            id = Integer.parseInt(tfID.getText().trim());
            attA = Float.parseFloat(tfAttendanceA.getText().trim());
            attB = Float.parseFloat(tfAttendanceB.getText().trim());
            attC = Float.parseFloat(tfAttendanceC.getText().trim());
            dues = Float.parseFloat(tfDues.getText().trim());
        } catch(Exception ignored){}

        List<Course> courses = new ArrayList<>();
        courses.add(new Course(crsA, crsA, attA));
        courses.add(new Course(crsB, crsB, attB));
        courses.add(new Course(crsC, crsC, attC));

        modelRef.setName(name);
        modelRef.setID(id);
        modelRef.setSemesterID(semester);
        modelRef.setCourses(courses);
        modelRef.setDue(dues);
        modelRef.setPassed(chkPassed.isSelected());
    }
}
