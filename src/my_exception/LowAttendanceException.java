package my_exception;

public class LowAttendanceException extends Exception {
    public LowAttendanceException() {
        super("Your attendance is below 70%. Therefore you are not qualified to sit in the exam.");
    }
    public LowAttendanceException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Your attendance is below 70%. Therefore you are not qualified to sit in the exam.";
    }
}
