package model;

import form.ExamFormModal;
import my_exception.LowAttendanceException;
import my_exception.MalformedFormException;

public class Office {
    private final FormModel fm;
    private AdmitCard admitCard;

    public Office() {
        fm = new FormModel();
    }

    public ExamFormModal getNewForm() {
        return new ExamFormModal(fm);
    }

    public void validate() throws MalformedFormException, LowAttendanceException {
        if(!fm.validate()) throw new MalformedFormException();

        float att = fm.getAverageAttendance();
        if(att < 70.0f) throw new LowAttendanceException();
    }

    public FormModel getForm() {
        return fm;
    }

    public AdmitCard getAdmitCard() {
        return admitCard;
    }

    public void setAdmitCard(AdmitCard admitCard) {
        this.admitCard = admitCard;
    }
}
