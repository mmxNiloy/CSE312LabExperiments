package model;

import my_exception.DebtException;
import my_exception.ExamFailureException;

public class Accounts {
    private FormModel form;
    private int fees;

    public Accounts() {
    }

    public FormModel getForm() {
        return form;
    }

    public void setForm(FormModel form) {
        this.form = form;
    }

    public void validate() throws DebtException {
        if(form.getDue() > 0.0f) throw new DebtException();
    }

    public int getFees() {
        int sem = Integer.parseInt(form.getSemesterID().substring(0, 1));
        return 1000 + (250 * (sem - 1));
    }
}
