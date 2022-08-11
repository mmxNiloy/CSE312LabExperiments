package model;

import forms.RecruitCandidateInfo;
import frame.ExamFrame;

public class Registrar {
    public static class Teacher extends Exam {
        @Override
        public void startExam(RecruitCandidateInfo infoForm) {
            examFrame = new ExamFrame();
            examFrame.form.setTypeId(CandidateType.TEACHER);
            examFrame.form.resetPanels();
            examFrame.form.setName(infoForm.getName());
            examFrame.form.setDepartment(infoForm.getDepartment());
            conductVivaExam();
            examFrame.setVisible(true);
        }
    }

    public static class Student extends Exam {
        @Override
        public void startExam(RecruitCandidateInfo infoForm) {
            examFrame = new ExamFrame();
            examFrame.form.setTypeId(CandidateType.STUDENT);
            examFrame.form.resetPanels();
            examFrame.form.setName(infoForm.getName());
            examFrame.form.setDepartment(infoForm.getDepartment());
            conductAdmissionTest();
            examFrame.setVisible(true);
        }
    }

    public static class Staff extends Exam {

        @Override
        public void startExam(RecruitCandidateInfo infoForm) {
            examFrame = new ExamFrame();
            examFrame.form.resetPanels();
            examFrame.form.setTypeId(CandidateType.STAFF);
            examFrame.form.setName(infoForm.getName());
            examFrame.form.setDepartment(infoForm.getDepartment());
            conductWrittenExam();
            conductVivaExam();
            conductPracticalExam();
            examFrame.setVisible(true);
        }
    }

    public static class Officer extends Exam {
        @Override
        public void startExam(RecruitCandidateInfo infoForm) {
            examFrame = new ExamFrame();
            examFrame.form.setTypeId(CandidateType.STAFF);
            examFrame.form.resetPanels();
            examFrame.form.setName(infoForm.getName());
            examFrame.form.setDepartment(infoForm.getDepartment());
            conductWrittenExam();
            conductVivaExam();
            examFrame.setVisible(true);
        }
    }
}
