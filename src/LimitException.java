public class LimitException extends RuntimeException {
    private int attempts;

    public int getAttempts() {
        return attempts;
    }

    LimitException(String message, int attempts) {
        super(message);
        this.attempts = attempts;
    }
    LimitException() {
    }
    String getNumberOfTryInput() {
        return getMessage() + attempts;
    }
}
