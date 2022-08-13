package model;

import my_exception.ExamFailureException;

import java.util.ArrayList;
import java.util.List;

public class Registrar {
    private FormModel form;

    public Registrar() {
    }

    public FormModel getForm() {
        return form;
    }

    public void setForm(FormModel form) {
        this.form = form;
    }

    public void validate() throws ExamFailureException {
        if(!form.isPassed()) throw new ExamFailureException();
    }
}
