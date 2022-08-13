package my_exception;

public class MalformedFormException extends Exception {
    @Override
    public String toString() {
        return "The information provided in the form is malformed. Please enter the information correctly before submitting.";
    }

    public MalformedFormException() {
        super("The information provided in the form is malformed. Please enter the information correctly before submitting.");
    }
    public MalformedFormException(String message) {
        super(message);
    }
}
