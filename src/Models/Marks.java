package Models;

public class Marks extends Student {
    private int[] courseCredits;
    private float[] marks;

    public Marks() {
        courseCredits = new int[3];
        marks = new float[3];
    }

    public Marks(String name, int id, String deptName) {
        super(name, id, deptName);
    }

    public Marks(int[] courseCredits, float[] marks) {
        this.courseCredits = courseCredits;
        this.marks = marks;
    }

    public Marks(String name, int id, String deptName, int[] courseCredits, float[] marks) {
        super(name, id, deptName);
        this.courseCredits = courseCredits;
        this.marks = marks;
    }

    public int[] getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int[] courseCredits) {
        this.courseCredits = courseCredits;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }
}
