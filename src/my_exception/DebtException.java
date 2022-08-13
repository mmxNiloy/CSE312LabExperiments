package my_exception;

public class DebtException extends Exception {
    public DebtException() {
        super("Please clear your previous dues with fines before proceeding.");
    }
    public DebtException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Please clear your previous dues with fines before proceeding.";
    }
}
