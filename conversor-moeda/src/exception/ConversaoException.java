package exception;

public class ConversaoException extends Exception {

    public ConversaoException(String message) {
        super(message);
    }

    public ConversaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
