package Models;

public class LetterGrade extends CTMA {
    private String[] letterGrades;
    public static final String[] GRADES = {
            "F", "D", "C-",
            "C", "C+", "B-",
            "B", "B+", "A-",
            "A", "A+"
    };
    public static final float[] GRADE_NUMBERS = {
            33.0f, 45.0f, 50.0f,
            55.0f, 60.0f, 65.0f,
            70.0f, 75.0f, 80.0f,
            85.0f, 90.0f
    };


    public LetterGrade() {
        letterGrades = new String[3];
    }

    public LetterGrade(String[] letterGrades) {
        this.letterGrades = letterGrades;
    }

    public LetterGrade(String name, int id, String deptName, String[] letterGrades) {
        super(name, id, deptName);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(int[] courseCredits, float[] marks, String[] letterGrades) {
        super(courseCredits, marks);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(String name, int id, String deptName, int[] courseCredits, float[] marks, String[] letterGrades) {
        super(name, id, deptName, courseCredits, marks);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(float[] ctmaMarks, String[] letterGrades) {
        super(ctmaMarks);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(String name, int id, String deptName, float[] ctmaMarks, String[] letterGrades) {
        super(name, id, deptName, ctmaMarks);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(int[] courseCredits, float[] marks, float[] ctmaMarks, String[] letterGrades) {
        super(courseCredits, marks, ctmaMarks);
        this.letterGrades = letterGrades;
    }

    public LetterGrade(String name, int id, String deptName, int[] courseCredits, float[] marks, float[] ctmaMarks, String[] letterGrades) {
        super(name, id, deptName, courseCredits, marks, ctmaMarks);
        this.letterGrades = letterGrades;
    }

    public void computeLetterGrades() {
        float[] examMarks = getMarks();
        float[] ctMarks = getCtmaMarks();
        for(int i = 0 ; i < examMarks.length ; i++)
            letterGrades[i] = letterGradeOf(examMarks[i] + ctMarks[i]);
    }

    public static String letterGradeOf(float number) {
        if(number > 100.0f) throw new IllegalArgumentException("Obtained test score cannot exceed 100%");

        return GRADES[Math.min(GRADES.length - 1, upperBound(GRADE_NUMBERS, number))];
    }
}
