package Models;

public class CTMA extends Marks {
    private float[] ctmaMarks;

    public CTMA() {
        ctmaMarks = new float[3];
    }

    public CTMA(String name, int id, String deptName) {
        super(name, id, deptName);
    }

    public CTMA(int[] courseCredits, float[] marks) {
        super(courseCredits, marks);
    }

    public CTMA(String name, int id, String deptName, int[] courseCredits, float[] marks) {
        super(name, id, deptName, courseCredits, marks);
    }

    public CTMA(float[] ctmaMarks) {
        this.ctmaMarks = ctmaMarks;
    }

    public CTMA(String name, int id, String deptName, float[] ctmaMarks) {
        super(name, id, deptName);
        this.ctmaMarks = ctmaMarks;
    }

    public CTMA(int[] courseCredits, float[] marks, float[] ctmaMarks) {
        super(courseCredits, marks);
        this.ctmaMarks = ctmaMarks;
    }

    public CTMA(String name, int id, String deptName, int[] courseCredits, float[] marks, float[] ctmaMarks) {
        super(name, id, deptName, courseCredits, marks);
        this.ctmaMarks = ctmaMarks;
    }

    public float[] getCtmaMarks() {
        return ctmaMarks;
    }

    public void setCtmaMarks(float[] ctmaMarks) {
        this.ctmaMarks = ctmaMarks;
    }
}
