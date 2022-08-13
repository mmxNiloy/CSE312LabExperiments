package my_exception;

public class ExamFailureException extends Exception {
    public ExamFailureException() {
        super("You are disqualified for the exam because you did not pass every subject last semester.");
    }
    public ExamFailureException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "You are disqualified for the exam because you did not pass every subject last semester.";
    }
}
