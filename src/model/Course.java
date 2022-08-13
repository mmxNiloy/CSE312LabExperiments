package model;

public class Course {
    private String courseTitle;
    private String courseID;
    private float attendance;

    public Course() {
    }

    public Course(String courseTitle, String courseID, float attendance) {
        this.courseTitle = courseTitle;
        this.courseID = courseID;
        this.attendance = attendance;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

    public boolean validate() {
        return !courseID.isEmpty() && !courseTitle.isEmpty() && attendance >= 0.0f;
    }
}
