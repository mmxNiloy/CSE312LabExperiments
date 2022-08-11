package Models;

public class Grader extends LetterGrade {
    private float cgpa;
    private String grade;
    private String[] grades;
    private float[] gpaGrades;
    public static final float[] GPA_GRADES = {0.0f, 1.0f, 1.25f, 1.5f, 1.75f, 2.0f, 2.5f, 2.75f, 3.0f, 3.5f, 4.0f};

    public Grader() {
        gpaGrades = new float[3];
        grades = new String[3];
        cgpa = 0;
        grade = "F";
    }

    public float getCGPA() {
        return cgpa;
    }

    public String getGrade() {
        return grade;
    }

    public float[] getGpaGrades() {
        return gpaGrades;
    }

    public void computeCGPA() {
        cgpa = 0.0f;
        float[] marks = getMarks();
        float[] ctMarks = getCtmaMarks();
        for(int i = 0 ; i < marks.length ; i++) {
            cgpa += (gpaGrades[i] = gpaOf(marks[i] + ctMarks[i]));
            grades[i] = letterGradeOf(marks[i] + ctMarks[i]);
        }
        for(int i = 0 ; i < marks.length ; i++) {
            if (gpaGrades[i] == 0.0f) {
                cgpa = 0.0f;
                break;
            }
        }

        cgpa /= (float) marks.length;
        grade = GRADES[upperBound(GPA_GRADES, cgpa)];
    }

    public static float gpaOf(float number) {
        if(number > 100.0f) throw new IllegalArgumentException("Obtained test score cannot exceed 100%");

        return GPA_GRADES[Math.min(GPA_GRADES.length - 1, upperBound(GRADE_NUMBERS, number))];
    }

    public String[] getGrades() {
        return grades;
    }
}