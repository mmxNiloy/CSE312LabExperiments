package my_exception;

public class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        super("The funds you've provided don't meet the required amount. Please provide the required amount.");
    }
    public InsufficientFundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "The funds you've provided don't meet the required amount. Please provide the required amount.";
    }
}
