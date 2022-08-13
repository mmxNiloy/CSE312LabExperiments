package model;

import my_exception.DebtException;

public class ExamController {
    private FormModel form;
    private AdmitCard admitCard;

    public ExamController() {
    }

    public FormModel getForm() {
        return form;
    }

    public void setForm(FormModel form) {
        this.form = form;
    }

    public void generateAdmitCard() {
        admitCard = new AdmitCard(form.getName(), form.getID(), form.getSemesterID());
        admitCard.generateKey();
    }

    public AdmitCard getAdmitCard() {
        return admitCard;
    }
}
