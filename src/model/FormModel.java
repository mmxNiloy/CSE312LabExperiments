package model;

import java.util.ArrayList;
import java.util.List;

public class FormModel {
    private String name;
    private int ID;
    private String semesterID;
    private boolean passed;
    private float due;
    private List<Course> courses;

    public FormModel() {
        courses = new ArrayList<>();
    }

    public FormModel(String name, int ID, String semesterID, List<Course> courses) {
        this.name = name;
        this.ID = ID;
        this.semesterID = semesterID;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public boolean validate() {
        boolean flag = name != null && semesterID != null &&
                !name.isEmpty() && ID >= 0 && !semesterID.isEmpty();

        for (Course course:
             courses) {
            flag &= course.validate();
        }

        return flag;
    }

    public float getAverageAttendance() {
        float ans = 0.0f;

        for(Course course : courses) ans += course.getAttendance();

        return ans / (float)courses.size();
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setDue(float due) {
        this.due = due;
    }

    public float getDue() {
        return due;
    }
}
