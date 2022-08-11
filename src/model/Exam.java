package model;

import forms.RecruitCandidateInfo;
import frame.ExamFrame;

public abstract class Exam {
    public ExamFrame examFrame;

    public void conductVivaExam() {
        examFrame.form.setVivaVisible(true);
    }

    public void conductWrittenExam() {
        examFrame.form.setWrittenVisible(true);
    }

    public void conductPracticalExam() {
        examFrame.form.setPracticalVisible(true);
    }

    public void conductAdmissionTest() {
        examFrame.form.setAdmissionVisible(true);
    }

    public abstract void startExam(RecruitCandidateInfo infoForm);
}
